
package nedu.edsn.data.p4collecteddatabatchresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResponseEnvelope_EDSNBusinessDocumentHeader_Destination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResponseEnvelope_EDSNBusinessDocumentHeader_Destination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Receiver" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_EDSNBusinessDocumentHeader_Destination_Receiver"/&gt;
 *         &lt;element name="Service" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_EDSNBusinessDocumentHeader_Destination_Service" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResponseEnvelope_EDSNBusinessDocumentHeader_Destination", propOrder = {
    "receiver",
    "service"
})
public class P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestination {

    @XmlElement(name = "Receiver", required = true)
    protected P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver receiver;
    @XmlElement(name = "Service")
    protected P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService service;

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     *     
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     *     
     */
    public void setReceiver(P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     *     
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     *     
     */
    public void setService(P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService value) {
        this.service = value;
    }

}
