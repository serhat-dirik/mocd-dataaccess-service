
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ArrayOfDataTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataTable" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataTable", propOrder = {
    "dataTable"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
public class ArrayOfDataTable {

    @XmlElement(name = "DataTable", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    protected List<ArrayOfDataTable.DataTable> dataTable=new ArrayList<ArrayOfDataTable.DataTable>();

    /**
     * Gets the value of the dataTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfDataTable.DataTable }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    public List<ArrayOfDataTable.DataTable> getDataTable() {
        if (dataTable == null) {
            dataTable = new ArrayList<ArrayOfDataTable.DataTable>();
        }
        return this.dataTable;
    }


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
     *         &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "any"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
    public static class DataTable {

        @XmlAnyElement(lax = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
        protected List<Object> any = new ArrayList<Object>();

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T01:01:07+04:00", comments = "JAXB RI v2.2.11")
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
