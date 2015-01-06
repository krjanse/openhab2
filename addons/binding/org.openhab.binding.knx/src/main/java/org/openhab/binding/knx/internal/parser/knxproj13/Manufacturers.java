//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 06:49:40 PM CET 
//


package org.openhab.binding.knx.internal.parser.knxproj13;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Manufacturers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manufacturers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManufacturerMaster" type="{http://knx.org/xml/project/13}ManufacturerMaster" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://knx.org/xml/project/13}Manufacturer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manufacturers", propOrder = {
    "manufacturerMaster",
    "manufacturer"
})
public class Manufacturers {

    @XmlElement(name = "ManufacturerMaster")
    protected List<ManufacturerMaster> manufacturerMaster;
    @XmlElement(name = "Manufacturer")
    protected List<Manufacturer> manufacturer;

    /**
     * Gets the value of the manufacturerMaster property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerMaster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerMaster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturerMaster }
     * 
     * 
     */
    public List<ManufacturerMaster> getManufacturerMaster() {
        if (manufacturerMaster == null) {
            manufacturerMaster = new ArrayList<ManufacturerMaster>();
        }
        return this.manufacturerMaster;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Manufacturer }
     * 
     * 
     */
    public List<Manufacturer> getManufacturer() {
        if (manufacturer == null) {
            manufacturer = new ArrayList<Manufacturer>();
        }
        return this.manufacturer;
    }

}
