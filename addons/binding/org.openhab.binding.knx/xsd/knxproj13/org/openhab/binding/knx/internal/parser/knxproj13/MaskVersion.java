//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 06:54:48 PM CET 
//


package org.openhab.binding.knx.internal.parser.knxproj13;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaskVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaskVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DownwardCompatibleMasks" type="{http://knx.org/xml/project/13}DownwardCompatibleMasks" minOccurs="0"/>
 *         &lt;element name="MaskEntries" type="{http://knx.org/xml/project/13}MaskEntries" minOccurs="0"/>
 *         &lt;element name="HawkConfigurationData" type="{http://knx.org/xml/project/13}HawkConfigurationData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaskVersion" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ManagementModel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MediumTypeRefId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MgmtDescriptor01" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="OtherMediumTypeRefId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaskVersion", propOrder = {
    "content"
})
public class MaskVersion {

    @XmlElementRefs({
        @XmlElementRef(name = "MaskEntries", namespace = "http://knx.org/xml/project/13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HawkConfigurationData", namespace = "http://knx.org/xml/project/13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DownwardCompatibleMasks", namespace = "http://knx.org/xml/project/13", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "Id")
    protected java.lang.String id;
    @XmlAttribute(name = "MaskVersion")
    protected Short maskVersion;
    @XmlAttribute(name = "Name")
    protected java.lang.String name;
    @XmlAttribute(name = "ManagementModel")
    protected java.lang.String managementModel;
    @XmlAttribute(name = "MediumTypeRefId")
    protected java.lang.String mediumTypeRefId;
    @XmlAttribute(name = "MgmtDescriptor01")
    protected Long mgmtDescriptor01;
    @XmlAttribute(name = "OtherMediumTypeRefId")
    protected java.lang.String otherMediumTypeRefId;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * {@link JAXBElement }{@code <}{@link HawkConfigurationData }{@code >}
     * {@link JAXBElement }{@code <}{@link MaskEntries }{@code >}
     * {@link JAXBElement }{@code <}{@link DownwardCompatibleMasks }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Gets the value of the maskVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaskVersion() {
        return maskVersion;
    }

    /**
     * Sets the value of the maskVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaskVersion(Short value) {
        this.maskVersion = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the managementModel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getManagementModel() {
        return managementModel;
    }

    /**
     * Sets the value of the managementModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setManagementModel(java.lang.String value) {
        this.managementModel = value;
    }

    /**
     * Gets the value of the mediumTypeRefId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMediumTypeRefId() {
        return mediumTypeRefId;
    }

    /**
     * Sets the value of the mediumTypeRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMediumTypeRefId(java.lang.String value) {
        this.mediumTypeRefId = value;
    }

    /**
     * Gets the value of the mgmtDescriptor01 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMgmtDescriptor01() {
        return mgmtDescriptor01;
    }

    /**
     * Sets the value of the mgmtDescriptor01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMgmtDescriptor01(Long value) {
        this.mgmtDescriptor01 = value;
    }

    /**
     * Gets the value of the otherMediumTypeRefId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOtherMediumTypeRefId() {
        return otherMediumTypeRefId;
    }

    /**
     * Sets the value of the otherMediumTypeRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOtherMediumTypeRefId(java.lang.String value) {
        this.otherMediumTypeRefId = value;
    }

}
