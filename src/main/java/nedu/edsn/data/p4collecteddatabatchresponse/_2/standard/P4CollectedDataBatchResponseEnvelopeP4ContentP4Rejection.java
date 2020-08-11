
package nedu.edsn.data.p4collecteddatabatchresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResponseEnvelope_P4Content_P4Rejection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResponseEnvelope_P4Content_P4Rejection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rejection" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_RejectionP4Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResponseEnvelope_P4Content_P4Rejection", propOrder = {
    "rejection"
})
public class P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection {

    @XmlElement(name = "Rejection", required = true)
    protected P4CollectedDataBatchResponseEnvelopeRejectionP4Type rejection;

    /**
     * Gets the value of the rejection property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchResponseEnvelopeRejectionP4Type }
     *     
     */
    public P4CollectedDataBatchResponseEnvelopeRejectionP4Type getRejection() {
        return rejection;
    }

    /**
     * Sets the value of the rejection property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchResponseEnvelopeRejectionP4Type }
     *     
     */
    public void setRejection(P4CollectedDataBatchResponseEnvelopeRejectionP4Type value) {
        this.rejection = value;
    }

}
