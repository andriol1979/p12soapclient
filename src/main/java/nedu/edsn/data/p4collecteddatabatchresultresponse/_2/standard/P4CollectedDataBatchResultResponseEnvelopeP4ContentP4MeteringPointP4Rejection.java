
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4Rejection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4Rejection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rejection" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_RejectionP4Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4Rejection", propOrder = {
    "rejection"
})
public class P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4Rejection {

    @XmlElement(name = "Rejection", required = true)
    protected P4CollectedDataBatchResultResponseEnvelopeRejectionP4Type rejection;

    /**
     * Gets the value of the rejection property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchResultResponseEnvelopeRejectionP4Type }
     *     
     */
    public P4CollectedDataBatchResultResponseEnvelopeRejectionP4Type getRejection() {
        return rejection;
    }

    /**
     * Sets the value of the rejection property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchResultResponseEnvelopeRejectionP4Type }
     *     
     */
    public void setRejection(P4CollectedDataBatchResultResponseEnvelopeRejectionP4Type value) {
        this.rejection = value;
    }

}
