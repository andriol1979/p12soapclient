
package nedu.edsn.data.p4collecteddatabatchresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResponseEnvelope_P4Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResponseEnvelope_P4Content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="P4Rejection" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_P4Content_P4Rejection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResponseEnvelope_P4Content", propOrder = {
    "p4Rejection"
})
public class P4CollectedDataBatchResponseEnvelopeP4Content {

    @XmlElement(name = "P4Rejection")
    protected P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection p4Rejection;

    /**
     * Gets the value of the p4Rejection property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection }
     *     
     */
    public P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection getP4Rejection() {
        return p4Rejection;
    }

    /**
     * Sets the value of the p4Rejection property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection }
     *     
     */
    public void setP4Rejection(P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection value) {
        this.p4Rejection = value;
    }

}
