/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.knx.internal.folder;

import static java.nio.file.StandardWatchEventKinds.*;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.smarthome.config.core.ConfigConstants;
import org.eclipse.smarthome.core.service.AbstractWatchQueueReader;
import org.eclipse.smarthome.core.service.AbstractWatchService;
import org.openhab.binding.knx.KNXProjectProvider;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is able to observe multiple folders for changes and notifies KNXProjectProviders to parse any knxproj
 * file.
 *
 * @author Karel Goderis - Initial contribution
 *
 */
public class KNXFolderObserver extends AbstractWatchService implements ManagedService {

    private static Logger logger = LoggerFactory.getLogger(KNXFolderObserver.class);

    private ArrayList<KNXProjectProvider> knxProjectProviders = new ArrayList<KNXProjectProvider>();

    private static Map<String, String[]> folderFileExtMap = new ConcurrentHashMap<String, String[]>();
    private static Set<File> ignoredFiles = new HashSet<>();

    protected void addKNXProjectProvider(KNXProjectProvider provider) {
        knxProjectProviders.add(provider);
        notifyUpdateToknxThingProvider(folderFileExtMap);
    }

    protected void removeKNXProjectProvider(KNXProjectProvider provider) {
        knxProjectProviders.remove(provider);
    }

    @Override
    public void activate() {
    }

    @Override
    protected AbstractWatchQueueReader buildWatchQueueReader(WatchService watchService, Path toWatch,
            Map<WatchKey, Path> registeredKeys) {
        return new WatchQueueReader(watchService, toWatch, registeredKeys, folderFileExtMap, knxProjectProviders);
    }

    @Override
    protected String getSourcePath() {
        return ConfigConstants.getConfigFolder();
    }

    @Override
    protected boolean watchSubDirectories() {
        return true;
    }

    @Override
    protected WatchKey registerDirectory(Path subDir) throws IOException {
        if (subDir != null && MapUtils.isNotEmpty(folderFileExtMap)) {
            String folderName = subDir.getFileName().toString();
            if (folderFileExtMap.containsKey(folderName)) {
                logger.trace("Registering a directory watch service on {}", subDir.toAbsolutePath().toString());
                return subDir.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
            }
        }

        return null;
    }

    private static class WatchQueueReader extends AbstractWatchQueueReader {

        private Map<String, String[]> folderFileExtMap = new ConcurrentHashMap<String, String[]>();
        private ArrayList<KNXProjectProvider> knxProjectProviders = null;

        public WatchQueueReader(WatchService watchService, Path dirToWatch, Map<WatchKey, Path> registeredKeys,
                Map<String, String[]> folderFileExtMap, ArrayList<KNXProjectProvider> knxProjectProviders) {
            super(watchService, dirToWatch, registeredKeys);

            this.folderFileExtMap = folderFileExtMap;
            this.knxProjectProviders = knxProjectProviders;
        }

        @Override
        protected void processWatchEvent(WatchEvent<?> event, Kind<?> kind, Path path) {
            File toCheck = getFileByFileExtMap(folderFileExtMap, path.getFileName().toString());
            if (toCheck != null) {
                for (KNXProjectProvider aProvider : knxProjectProviders) {
                    checkFile(aProvider, toCheck, kind);
                }
            }
        }
    }

    @Override
    @SuppressWarnings("rawtypes")
    public synchronized void updated(Dictionary config) throws ConfigurationException {
        if (config != null) {
            // necessary to check removed models
            Map<String, String[]> previousFolderFileExtMap = new ConcurrentHashMap<String, String[]>(folderFileExtMap);

            // make sure to clear the caches first
            folderFileExtMap.clear();

            Enumeration keys = config.keys();
            while (keys.hasMoreElements()) {

                String foldername = (String) keys.nextElement();
                if (foldername.equals("service.pid")) {
                    continue;
                }

                String[] fileExts = ((String) config.get(foldername)).split(",");

                File folder = getFile(foldername);
                if (folder.exists() && folder.isDirectory()) {
                    folderFileExtMap.put(foldername, fileExts);
                } else {
                    logger.warn("Directory '{}' does not exist in '{}'. Please check your configuration settings!",
                            foldername, ConfigConstants.getConfigFolder());
                }
            }

            notifyUpdateToknxThingProvider(previousFolderFileExtMap);
            initializeWatchService();
        }
    }

    private void notifyUpdateToknxThingProvider(Map<String, String[]> previousFolderFileExtMap) {
        checkDeletedProjects(previousFolderFileExtMap);

        if (MapUtils.isNotEmpty(folderFileExtMap)) {
            Iterator<String> iterator = folderFileExtMap.keySet().iterator();
            while (iterator.hasNext()) {
                String folderName = iterator.next();

                final String[] validExtension = folderFileExtMap.get(folderName);
                if (validExtension != null && validExtension.length > 0) {
                    File folder = getFile(folderName);
                    File[] files = folder.listFiles(new FileExtensionsFilter(validExtension));

                    if (files != null && files.length > 0) {
                        for (File file : files) {
                            for (KNXProjectProvider aProvider : knxProjectProviders) {
                                checkFile(aProvider, file, ENTRY_CREATE);
                            }
                        }
                    }
                }
            }
        }
    }

    private void checkDeletedProjects(Map<String, String[]> previousFolderFileExtMap) {
        if (MapUtils.isNotEmpty(previousFolderFileExtMap)) {
            for (KNXProjectProvider aProvider : knxProjectProviders) {
                List<File> projectsToRemove = new LinkedList<File>();

                if (MapUtils.isNotEmpty(folderFileExtMap)) {
                    Set<String> folders = previousFolderFileExtMap.keySet();

                    for (String folder : folders) {
                        if (!folderFileExtMap.containsKey(folder)) {
                            // Iterable<String> projects = aProvider.getAllProjectsOfFolder(folder);
                            Iterable<File> projects = aProvider.getAllProjects();
                            ArrayList<File> toDelete = new ArrayList<File>();
                            for (File aProject : projects) {
                                if (aProject.getPath().equals(folder)) {
                                    toDelete.add(aProject);
                                }
                            }
                            if (toDelete != null) {
                                projectsToRemove.addAll(toDelete);
                            }
                        }
                    }
                } else {
                    Set<String> folders = previousFolderFileExtMap.keySet();

                    for (String folder : folders) {
                        synchronized (KNXFolderObserver.class) {
                            // Iterable<String> projects = aProvider.getAllProjectsOfFolder(folder);
                            Iterable<File> projects = aProvider.getAllProjects();
                            ArrayList<File> toDelete = new ArrayList<File>();
                            for (File aProject : projects) {
                                if (aProject.getPath().equals(folder)) {
                                    toDelete.add(aProject);
                                }
                            }
                            if (toDelete != null) {
                                projectsToRemove.addAll(toDelete);
                            }
                        }
                    }
                }

                if (CollectionUtils.isNotEmpty(projectsToRemove)) {
                    for (File projectToRemove : projectsToRemove) {
                        synchronized (KNXFolderObserver.class) {
                            aProvider.removeProject(projectToRemove);
                        }
                    }
                }
            }
        }
    }

    protected class FileExtensionsFilter implements FilenameFilter {

        private String[] validExtensions;

        public FileExtensionsFilter(String[] validExtensions) {
            this.validExtensions = validExtensions;
        }

        @Override
        public boolean accept(File dir, String name) {
            if (validExtensions != null && validExtensions.length > 0) {
                for (String extension : validExtensions) {
                    if (name.toLowerCase().endsWith("." + extension)) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    @SuppressWarnings("rawtypes")
    private static void checkFile(KNXProjectProvider knxProjectProvider, final File file, Kind kind) {
        if (knxProjectProvider != null && file != null) {
            try {
                synchronized (KNXFolderObserver.class) {
                    if ((kind == ENTRY_CREATE || kind == ENTRY_MODIFY) && file != null) {
                        if (checkExtension(folderFileExtMap, file.getName())) {
                            logger.trace("Adding or refreshing the project contained in {}",
                                    file.getAbsolutePath().toString());
                            knxProjectProvider.addOrRefreshProject(file);
                        } else {
                            ignoredFiles.add(file);
                        }
                    } else if (kind == ENTRY_DELETE && file != null) {
                        logger.trace("Removing the project contained in {}", file.getAbsolutePath().toString());
                        knxProjectProvider.removeProject(file);
                    }
                }
            } catch (Exception e) {
                LoggerFactory.getLogger(KNXFolderObserver.class)
                        .warn("Cannot open file '" + file.getAbsolutePath() + "' for reading.", e);
            }
        }
    }

    private static boolean checkExtension(Map<String, String[]> folderFileExtMap, String filename) {
        if (StringUtils.isNotBlank(filename) && MapUtils.isNotEmpty(folderFileExtMap)) {

            logger.trace("Verifying the extension of file {}", filename);
            String extension = getExtension(filename);

            if (StringUtils.isNotBlank(extension)) {
                Set<Entry<String, String[]>> entries = folderFileExtMap.entrySet();
                Iterator<Entry<String, String[]>> iterator = entries.iterator();
                while (iterator.hasNext()) {
                    Entry<String, String[]> entry = iterator.next();

                    if (ArrayUtils.contains(entry.getValue(), extension)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static File getFileByFileExtMap(Map<String, String[]> folderFileExtMap, String filename) {
        if (StringUtils.isNotBlank(filename) && MapUtils.isNotEmpty(folderFileExtMap)) {

            logger.trace("Looking up the File for file {}", filename);
            String extension = getExtension(filename);

            if (StringUtils.isNotBlank(extension)) {
                Set<Entry<String, String[]>> entries = folderFileExtMap.entrySet();
                Iterator<Entry<String, String[]>> iterator = entries.iterator();
                while (iterator.hasNext()) {
                    Entry<String, String[]> entry = iterator.next();

                    if (ArrayUtils.contains(entry.getValue(), extension)) {
                        return new File(getFile(entry.getKey()) + File.separator + filename);
                    }
                }
            }
        }

        return null;
    }

    /**
     * Returns the {@link File} object for the given filename. <br />
     * It must be contained in the configuration folder
     *
     * @param filename
     *            the file name to get the {@link File} for
     * @return the corresponding {@link File}
     */
    private static File getFile(String filename) {
        logger.trace("The config folder is located at {}", ConfigConstants.getConfigFolder());
        File folder = new File(ConfigConstants.getConfigFolder() + File.separator + filename);

        return folder;
    }

    /**
     * Returns the extension of the given file
     *
     * @param filename
     *            the file name to get the extension
     * @return the file's extension
     */
    public static String getExtension(String filename) {
        String fileExt = filename.substring(filename.lastIndexOf(".") + 1);

        return fileExt;
    }
}