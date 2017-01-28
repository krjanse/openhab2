//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 05:23:12 PM CET 
//


package org.openhab.binding.knx.internal.parser.knxproj13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatapointTypes" type="{http://knx.org/xml/project/13}DatapointTypes"/>
 *         &lt;element name="InterfaceObjectTypes" type="{http://knx.org/xml/project/13}InterfaceObjectTypes"/>
 *         &lt;element name="InterfaceObjectProperties" type="{http://knx.org/xml/project/13}InterfaceObjectProperties"/>
 *         &lt;element name="PropertyDataTypes" type="{http://knx.org/xml/project/13}PropertyDataTypes"/>
 *         &lt;element name="MediumTypes" type="{http://knx.org/xml/project/13}MediumTypes"/>
 *         &lt;element name="MaskVersions" type="{http://knx.org/xml/project/13}MaskVersions"/>
 *         &lt;element name="FunctionalBlocks" type="{http://knx.org/xml/project/13}FunctionalBlocks"/>
 *         &lt;element name="ProductLanguages" type="{http://knx.org/xml/project/13}ProductLanguages"/>
 *         &lt;element name="Manufacturers" type="{http://knx.org/xml/project/13}Manufacturers"/>
 *         &lt;element name="Languages" type="{http://knx.org/xml/project/13}Languages"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Signature" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterData", propOrder = {
    "datapointTypes",
    "interfaceObjectTypes",
    "interfaceObjectProperties",
    "propertyDataTypes",
    "mediumTypes",
    "maskVersions",
    "functionalBlocks",
    "productLanguages",
    "manufacturers",
    "languages"
})
public class MasterData {

    @XmlElement(name = "DatapointTypes", required = true)
    protected DatapointTypes datapointTypes;
    @XmlElement(name = "InterfaceObjectTypes", required = true)
    protected InterfaceObjectTypes interfaceObjectTypes;
    @XmlElement(name = "InterfaceObjectProperties", required = true)
    protected InterfaceObjectProperties interfaceObjectProperties;
    @XmlElement(name = "PropertyDataTypes", required = true)
    protected PropertyDataTypes propertyDataTypes;
    @XmlElement(name = "MediumTypes", required = true)
    protected MediumTypes mediumTypes;
    @XmlElement(name = "MaskVersions", required = true)
    protected MaskVersions maskVersions;
    @XmlElement(name = "FunctionalBlocks", required = true)
    protected FunctionalBlocks functionalBlocks;
    @XmlElement(name = "ProductLanguages", required = true)
    protected ProductLanguages productLanguages;
    @XmlElement(name = "Manufacturers", required = true)
    protected Manufacturers manufacturers;
    @XmlElement(name = "Languages", required = true)
    protected Languages languages;
    @XmlAttribute(name = "Id")
    protected java.lang.String id;
    @XmlAttribute(name = "Version")
    protected Short version;
    @XmlAttribute(name = "Signature")
    protected java.lang.String signature;

    /**
     * Gets the value of the datapointTypes property.
     * 
     * @return
     *     possible object is
     *     {@link DatapointTypes }
     *     
     */
    public DatapointTypes getDatapointTypes() {
        return datapointTypes;
    }

    /**
     * Sets the value of the datapointTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatapointTypes }
     *     
     */
    public void setDatapointTypes(DatapointTypes value) {
        this.datapointTypes = value;
    }

    /**
     * Gets the value of the interfaceObjectTypes property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceObjectTypes }
     *     
     */
    public InterfaceObjectTypes getInterfaceObjectTypes() {
        return interfaceObjectTypes;
    }

    /**
     * Sets the value of the interfaceObjectTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceObjectTypes }
     *     
     */
    public void setInterfaceObjectTypes(InterfaceObjectTypes value) {
        this.interfaceObjectTypes = value;
    }

    /**
     * Gets the value of the interfaceObjectProperties property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceObjectProperties }
     *     
     */
    public InterfaceObjectProperties getInterfaceObjectProperties() {
        return interfaceObjectProperties;
    }

    /**
     * Sets the value of the interfaceObjectProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceObjectProperties }
     *     
     */
    public void setInterfaceObjectProperties(InterfaceObjectProperties value) {
        this.interfaceObjectProperties = value;
    }

    /**
     * Gets the value of the propertyDataTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyDataTypes }
     *     
     */
    public PropertyDataTypes getPropertyDataTypes() {
        return propertyDataTypes;
    }

    /**
     * Sets the value of the propertyDataTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDataTypes }
     *     
     */
    public void setPropertyDataTypes(PropertyDataTypes value) {
        this.propertyDataTypes = value;
    }

    /**
     * Gets the value of the mediumTypes property.
     * 
     * @return
     *     possible object is
     *     {@link MediumTypes }
     *     
     */
    public MediumTypes getMediumTypes() {
        return mediumTypes;
    }

    /**
     * Sets the value of the mediumTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumTypes }
     *     
     */
    public void setMediumTypes(MediumTypes value) {
        this.mediumTypes = value;
    }

    /**
     * Gets the value of the maskVersions property.
     * 
     * @return
     *     possible object is
     *     {@link MaskVersions }
     *     
     */
    public MaskVersions getMaskVersions() {
        return maskVersions;
    }

    /**
     * Sets the value of the maskVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaskVersions }
     *     
     */
    public void setMaskVersions(MaskVersions value) {
        this.maskVersions = value;
    }

    /**
     * Gets the value of the functionalBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionalBlocks }
     *     
     */
    public FunctionalBlocks getFunctionalBlocks() {
        return functionalBlocks;
    }

    /**
     * Sets the value of the functionalBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionalBlocks }
     *     
     */
    public void setFunctionalBlocks(FunctionalBlocks value) {
        this.functionalBlocks = value;
    }

    /**
     * Gets the value of the productLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLanguages }
     *     
     */
    public ProductLanguages getProductLanguages() {
        return productLanguages;
    }

    /**
     * Sets the value of the productLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLanguages }
     *     
     */
    public void setProductLanguages(ProductLanguages value) {
        this.productLanguages = value;
    }

    /**
     * Gets the value of the manufacturers property.
     * 
     * @return
     *     possible object is
     *     {@link Manufacturers }
     *     
     */
    public Manufacturers getManufacturers() {
        return manufacturers;
    }

    /**
     * Sets the value of the manufacturers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Manufacturers }
     *     
     */
    public void setManufacturers(Manufacturers value) {
        this.manufacturers = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link Languages }
     *     
     */
    public Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Languages }
     *     
     */
    public void setLanguages(Languages value) {
        this.languages = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVersion(Short value) {
        this.version = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSignature(java.lang.String value) {
        this.signature = value;
    }

}