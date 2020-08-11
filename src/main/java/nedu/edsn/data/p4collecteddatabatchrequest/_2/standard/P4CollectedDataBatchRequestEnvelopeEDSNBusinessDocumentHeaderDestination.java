
package nedu.edsn.data.p4collecteddatabatchrequest._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader_Destination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader_Destination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Receiver" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader_Destination_Receiver"/&gt;
 *         &lt;element name="Service" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader_Destination_Service" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader_Destination", propOrder = {
    "receiver",
    "service"
})
public class P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination {

    @XmlElement(name = "Receiver", required = true)
    protected P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver receiver;
    @XmlElement(name = "Service")
    protected P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService service;

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     *     
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     *     
     */
    public void setReceiver(P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     *     
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     *     
     */
    public void setService(P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService value) {
        this.service = value;
    }

}
