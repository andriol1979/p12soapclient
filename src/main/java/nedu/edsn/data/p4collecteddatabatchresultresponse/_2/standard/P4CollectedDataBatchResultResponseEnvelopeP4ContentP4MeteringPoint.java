
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EANID" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_GSRNEANCode"/&gt;
 *         &lt;element name="ExternalReference" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_ReferenceTextType"/&gt;
 *         &lt;element name="QueryDate" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_Date" minOccurs="0"/&gt;
 *         &lt;element name="QueryReason" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_QueryReasonTypeCode"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="P4EnergyMeter" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4EnergyMeter" maxOccurs="unbounded"/&gt;
 *           &lt;element name="P4Rejection" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4Rejection" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint", propOrder = {
    "eanid",
    "externalReference",
    "queryDate",
    "queryReason",
    "p4EnergyMeter",
    "p4Rejection"
})
public class P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPoint {

    @XmlElement(name = "EANID", required = true)
    protected String eanid;
    @XmlElement(name = "ExternalReference", required = true)
    protected String externalReference;
    @XmlElement(name = "QueryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar queryDate;
    @XmlElement(name = "QueryReason", required = true)
    @XmlSchemaType(name = "string")
    protected P4CollectedDataBatchResultResponseEnvelopeQueryReasonTypeCode queryReason;
    @XmlElement(name = "P4EnergyMeter")
    protected List<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeter> p4EnergyMeter;
    @XmlElement(name = "P4Rejection")
    protected List<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4Rejection> p4Rejection;

    /**
     * Gets the value of the eanid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANID() {
        return eanid;
    }

    /**
     * Sets the value of the eanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEANID(String value) {
        this.eanid = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the queryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQueryDate() {
        return queryDate;
    }

    /**
     * Sets the value of the queryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQueryDate(XMLGregorianCalendar value) {
        this.queryDate = value;
    }

    /**
     * Gets the value of the queryReason property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchResultResponseEnvelopeQueryReasonTypeCode }
     *     
     */
    public P4CollectedDataBatchResultResponseEnvelopeQueryReasonTypeCode getQueryReason() {
        return queryReason;
    }

    /**
     * Sets the value of the queryReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchResultResponseEnvelopeQueryReasonTypeCode }
     *     
     */
    public void setQueryReason(P4CollectedDataBatchResultResponseEnvelopeQueryReasonTypeCode value) {
        this.queryReason = value;
    }

    /**
     * Gets the value of the p4EnergyMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p4EnergyMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP4EnergyMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeter }
     * 
     * 
     */
    public List<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeter> getP4EnergyMeter() {
        if (p4EnergyMeter == null) {
            p4EnergyMeter = new ArrayList<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeter>();
        }
        return this.p4EnergyMeter;
    }

    /**
     * Gets the value of the p4Rejection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p4Rejection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP4Rejection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4Rejection }
     * 
     * 
     */
    public List<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4Rejection> getP4Rejection() {
        if (p4Rejection == null) {
            p4Rejection = new ArrayList<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4Rejection>();
        }
        return this.p4Rejection;
    }

}
