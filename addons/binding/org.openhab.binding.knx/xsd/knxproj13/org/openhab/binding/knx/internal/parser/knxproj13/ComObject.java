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


/**
 * <p>Java class for ComObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DatapointType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FunctionText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ObjectSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CommunicationFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReadFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReadOnInitFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransmitFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UpdateFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WriteFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Disabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VisibleDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComObject")
public class ComObject {

    @XmlAttribute(name = "Id")
    protected java.lang.String id;
    @XmlAttribute(name = "DatapointType")
    protected java.lang.String datapointType;
    @XmlAttribute(name = "FunctionText")
    protected java.lang.String functionText;
    @XmlAttribute(name = "Name")
    protected java.lang.String name;
    @XmlAttribute(name = "Number")
    protected java.lang.String number;
    @XmlAttribute(name = "ObjectSize")
    protected java.lang.String objectSize;
    @XmlAttribute(name = "Priority")
    protected java.lang.String priority;
    @XmlAttribute(name = "CommunicationFlag")
    protected java.lang.String communicationFlag;
    @XmlAttribute(name = "ReadFlag")
    protected java.lang.String readFlag;
    @XmlAttribute(name = "ReadOnInitFlag")
    protected java.lang.String readOnInitFlag;
    @XmlAttribute(name = "TransmitFlag")
    protected java.lang.String transmitFlag;
    @XmlAttribute(name = "UpdateFlag")
    protected java.lang.String updateFlag;
    @XmlAttribute(name = "WriteFlag")
    protected java.lang.String writeFlag;
    @XmlAttribute(name = "Disabled")
    protected java.lang.String disabled;
    @XmlAttribute(name = "Text")
    protected java.lang.String text;
    @XmlAttribute(name = "VisibleDescription")
    protected java.lang.String visibleDescription;

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
     * Gets the value of the datapointType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDatapointType() {
        return datapointType;
    }

    /**
     * Sets the value of the datapointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDatapointType(java.lang.String value) {
        this.datapointType = value;
    }

    /**
     * Gets the value of the functionText property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFunctionText() {
        return functionText;
    }

    /**
     * Sets the value of the functionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFunctionText(java.lang.String value) {
        this.functionText = value;
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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNumber(java.lang.String value) {
        this.number = value;
    }

    /**
     * Gets the value of the objectSize property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getObjectSize() {
        return objectSize;
    }

    /**
     * Sets the value of the objectSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setObjectSize(java.lang.String value) {
        this.objectSize = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPriority(java.lang.String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the communicationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCommunicationFlag() {
        return communicationFlag;
    }

    /**
     * Sets the value of the communicationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCommunicationFlag(java.lang.String value) {
        this.communicationFlag = value;
    }

    /**
     * Gets the value of the readFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getReadFlag() {
        return readFlag;
    }

    /**
     * Sets the value of the readFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setReadFlag(java.lang.String value) {
        this.readFlag = value;
    }

    /**
     * Gets the value of the readOnInitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getReadOnInitFlag() {
        return readOnInitFlag;
    }

    /**
     * Sets the value of the readOnInitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setReadOnInitFlag(java.lang.String value) {
        this.readOnInitFlag = value;
    }

    /**
     * Gets the value of the transmitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTransmitFlag() {
        return transmitFlag;
    }

    /**
     * Sets the value of the transmitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTransmitFlag(java.lang.String value) {
        this.transmitFlag = value;
    }

    /**
     * Gets the value of the updateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * Sets the value of the updateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUpdateFlag(java.lang.String value) {
        this.updateFlag = value;
    }

    /**
     * Gets the value of the writeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getWriteFlag() {
        return writeFlag;
    }

    /**
     * Sets the value of the writeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setWriteFlag(java.lang.String value) {
        this.writeFlag = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDisabled(java.lang.String value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setText(java.lang.String value) {
        this.text = value;
    }

    /**
     * Gets the value of the visibleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVisibleDescription() {
        return visibleDescription;
    }

    /**
     * Sets the value of the visibleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVisibleDescription(java.lang.String value) {
        this.visibleDescription = value;
    }

}
