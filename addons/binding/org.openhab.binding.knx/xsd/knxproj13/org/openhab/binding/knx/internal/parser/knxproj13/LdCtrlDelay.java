//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 06:54:48 PM CET 
//


package org.openhab.binding.knx.internal.parser.knxproj13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for LdCtrlDelay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LdCtrlDelay">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="MilliSeconds" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Verify" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InlineData" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LdCtrlDelayValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LdCtrlDelay", propOrder = {
    "value"
})
public class LdCtrlDelay {

    @XmlValue
    protected java.lang.String value;
    @XmlAttribute(name = "MilliSeconds")
    protected Short milliSeconds;
    @XmlAttribute(name = "Address")
    protected Short address;
    @XmlAttribute(name = "Size")
    protected Short size;
    @XmlAttribute(name = "Verify")
    protected java.lang.String verify;
    @XmlAttribute(name = "InlineData")
    protected java.lang.String inlineData;
    @XmlAttribute(name = "Name")
    protected java.lang.String name;
    @XmlAttribute(name = "LdCtrlDelayValue")
    protected java.lang.String ldCtrlDelayValue;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    /**
     * Gets the value of the milliSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMilliSeconds() {
        return milliSeconds;
    }

    /**
     * Sets the value of the milliSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMilliSeconds(Short value) {
        this.milliSeconds = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAddress(Short value) {
        this.address = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSize(Short value) {
        this.size = value;
    }

    /**
     * Gets the value of the verify property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVerify() {
        return verify;
    }

    /**
     * Sets the value of the verify property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVerify(java.lang.String value) {
        this.verify = value;
    }

    /**
     * Gets the value of the inlineData property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getInlineData() {
        return inlineData;
    }

    /**
     * Sets the value of the inlineData property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setInlineData(java.lang.String value) {
        this.inlineData = value;
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
     * Gets the value of the ldCtrlDelayValue property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLdCtrlDelayValue() {
        return ldCtrlDelayValue;
    }

    /**
     * Sets the value of the ldCtrlDelayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLdCtrlDelayValue(java.lang.String value) {
        this.ldCtrlDelayValue = value;
    }

}
