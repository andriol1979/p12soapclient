
package nedu.edsn.data.p4collecteddatabatchrequest._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchRequestEnvelope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchRequestEnvelope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EDSNBusinessDocumentHeader" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader"/&gt;
 *         &lt;element name="P4Content" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_P4Content"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchRequestEnvelope", propOrder = {
    "edsnBusinessDocumentHeader",
    "p4Content"
})
public class P4CollectedDataBatchRequestEnvelope {

    @XmlElement(name = "EDSNBusinessDocumentHeader", required = true)
    protected P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader edsnBusinessDocumentHeader;
    @XmlElement(name = "P4Content", required = true)
    protected P4CollectedDataBatchRequestEnvelopeP4Content p4Content;

    /**
     * Gets the value of the edsnBusinessDocumentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader }
     *     
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader getEDSNBusinessDocumentHeader() {
        return edsnBusinessDocumentHeader;
    }

    /**
     * Sets the value of the edsnBusinessDocumentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader }
     *     
     */
    public void setEDSNBusinessDocumentHeader(P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader value) {
        this.edsnBusinessDocumentHeader = value;
    }

    /**
     * Gets the value of the p4Content property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchRequestEnvelopeP4Content }
     *     
     */
    public P4CollectedDataBatchRequestEnvelopeP4Content getP4Content() {
        return p4Content;
    }

    /**
     * Sets the value of the p4Content property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchRequestEnvelopeP4Content }
     *     
     */
    public void setP4Content(P4CollectedDataBatchRequestEnvelopeP4Content value) {
        this.p4Content = value;
    }

}
