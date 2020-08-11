
package nedu.edsn.data.p4collecteddatabatchrequest._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for P4CollectedDataBatchRequestEnvelope_P4Content_P4MeteringPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchRequestEnvelope_P4Content_P4MeteringPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EANID" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_GSRNEANCode"/&gt;
 *         &lt;element name="ExternalReference" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_ReferenceTextType"/&gt;
 *         &lt;element name="QueryDate" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Date" minOccurs="0"/&gt;
 *         &lt;element name="QueryReason" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_QueryReasonTypeCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchRequestEnvelope_P4Content_P4MeteringPoint", propOrder = {
    "eanid",
    "externalReference",
    "queryDate",
    "queryReason"
})
public class P4CollectedDataBatchRequestEnvelopeP4ContentP4MeteringPoint {

    @XmlElement(name = "EANID", required = true)
    protected String eanid;
    @XmlElement(name = "ExternalReference", required = true)
    protected String externalReference;
    @XmlElement(name = "QueryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar queryDate;
    @XmlElement(name = "QueryReason", required = true)
    @XmlSchemaType(name = "string")
    protected P4CollectedDataBatchRequestEnvelopeQueryReasonTypeCode queryReason;

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
     *     {@link P4CollectedDataBatchRequestEnvelopeQueryReasonTypeCode }
     *     
     */
    public P4CollectedDataBatchRequestEnvelopeQueryReasonTypeCode getQueryReason() {
        return queryReason;
    }

    /**
     * Sets the value of the queryReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchRequestEnvelopeQueryReasonTypeCode }
     *     
     */
    public void setQueryReason(P4CollectedDataBatchRequestEnvelopeQueryReasonTypeCode value) {
        this.queryReason = value;
    }

}
