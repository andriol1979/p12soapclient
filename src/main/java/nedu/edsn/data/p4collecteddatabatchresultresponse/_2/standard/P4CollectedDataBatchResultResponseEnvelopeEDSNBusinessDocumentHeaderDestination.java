
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Destination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Destination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Receiver" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Destination_Receiver"/&gt;
 *         &lt;element name="Service" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Destination_Service" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Destination", propOrder = {
    "receiver",
    "service"
})
public class P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestination {

    @XmlElement(name = "Receiver", required = true)
    protected P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver receiver;
    @XmlElement(name = "Service")
    protected P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService service;

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     *     
     */
    public P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     *     
     */
    public void setReceiver(P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     *     
     */
    public P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     *     
     */
    public void setService(P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService value) {
        this.service = value;
    }

}
