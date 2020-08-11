
package nedu.edsn.data.p4collecteddatabatchresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResponseEnvelope_RejectionP4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResponseEnvelope_RejectionP4Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RejectionCode" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_RejectionReasonType"/&gt;
 *         &lt;element name="RejectionText" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResponseEnvelope_RejectionP4Type", propOrder = {
    "rejectionCode",
    "rejectionText"
})
public class P4CollectedDataBatchResponseEnvelopeRejectionP4Type {

    @XmlElement(name = "RejectionCode", required = true)
    protected String rejectionCode;
    @XmlElement(name = "RejectionText")
    protected String rejectionText;

    /**
     * Gets the value of the rejectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionCode() {
        return rejectionCode;
    }

    /**
     * Sets the value of the rejectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionCode(String value) {
        this.rejectionCode = value;
    }

    /**
     * Gets the value of the rejectionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionText() {
        return rejectionText;
    }

    /**
     * Sets the value of the rejectionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionText(String value) {
        this.rejectionText = value;
    }

}
