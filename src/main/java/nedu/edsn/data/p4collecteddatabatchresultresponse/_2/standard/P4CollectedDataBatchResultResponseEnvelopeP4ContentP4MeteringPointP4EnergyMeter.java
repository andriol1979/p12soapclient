
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4EnergyMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4EnergyMeter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_EnergyMeterIDType"/&gt;
 *         &lt;element name="P4Register" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4EnergyMeter_P4Register" maxOccurs="4"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4EnergyMeter", propOrder = {
    "id",
    "p4Register"
})
public class P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeter {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "P4Register", required = true)
    protected List<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeterP4Register> p4Register;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the p4Register property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p4Register property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP4Register().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeterP4Register }
     * 
     * 
     */
    public List<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeterP4Register> getP4Register() {
        if (p4Register == null) {
            p4Register = new ArrayList<P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeterP4Register>();
        }
        return this.p4Register;
    }

}
