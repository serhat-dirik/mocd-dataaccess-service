
package org.tempuri;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationNo",
    "licenseNumber"
})
@XmlRootElement(name = "GetTransactionInfo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
public class GetTransactionInfo {

    @XmlElement(name = "ApplicationNo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    protected String applicationNo;
    @XmlElement(name = "LicenseNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    protected String licenseNumber;

    /**
     * Gets the value of the applicationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    public String getApplicationNo() {
        return applicationNo;
    }

    /**
     * Sets the value of the applicationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    public void setApplicationNo(String value) {
        this.applicationNo = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

}
