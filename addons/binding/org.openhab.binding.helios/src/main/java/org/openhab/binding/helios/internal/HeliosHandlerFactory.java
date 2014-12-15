/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.helios.internal;

import static org.openhab.binding.helios.HeliosBindingConstants.*;

import java.util.Collection;

import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;
import org.openhab.binding.helios.handler.HeliosHandler213;
import org.openhab.binding.helios.handler.HeliosHandler27;

import com.google.common.collect.Lists;

/**
 * The {@link HeliosHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Karel Goderis - Initial contribution
 */
public class HeliosHandlerFactory extends BaseThingHandlerFactory {

    private final static Collection<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Lists
            .newArrayList(HELIOS_VARIO_IP_2_7_TYPE, HELIOS_VARIO_IP_2_13_TYPE);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected ThingHandler createHandler(Thing thing) {

        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (thingTypeUID.equals(HELIOS_VARIO_IP_2_7_TYPE)) {
            return new HeliosHandler27(thing);
        }

        if (thingTypeUID.equals(HELIOS_VARIO_IP_2_13_TYPE)) {
            return new HeliosHandler213(thing);
        }

        return null;
    }
}