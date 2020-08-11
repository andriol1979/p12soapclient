
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_P4Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_P4Content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="P4MeteringPoint" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_P4Content", propOrder = {
    "p4MeteringPoint"
})
public class P4CollectedDataBatchResultResponseEnvelopeP4Content {

    @XmlElement(name = "P4MeteringPoint")
    protected List<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPoint> p4MeteringPoint;

    /**
     * Gets the value of the p4MeteringPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p4MeteringPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP4MeteringPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPoint }
     * 
     * 
     */
    public List<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPoint> getP4MeteringPoint() {
        if (p4MeteringPoint == null) {
            p4MeteringPoint = new ArrayList<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPoint>();
        }
        return this.p4MeteringPoint;
    }

}
