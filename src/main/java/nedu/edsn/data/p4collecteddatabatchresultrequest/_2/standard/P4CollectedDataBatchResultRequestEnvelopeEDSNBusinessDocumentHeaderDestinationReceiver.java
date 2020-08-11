
package nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultRequestEnvelope_EDSNBusinessDocumentHeader_Destination_Receiver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultRequestEnvelope_EDSNBusinessDocumentHeader_Destination_Receiver"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authority" type="{urn:nedu:edsn:data:p4collecteddatabatchresultrequest:2:standard}P4CollectedDataBatchResultRequestEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="ContactTypeIdentifier" type="{urn:nedu:edsn:data:p4collecteddatabatchresultrequest:2:standard}P4CollectedDataBatchResultRequestEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverID" type="{urn:nedu:edsn:data:p4collecteddatabatchresultrequest:2:standard}P4CollectedDataBatchResultRequestEnvelope_Identifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultRequestEnvelope_EDSNBusinessDocumentHeader_Destination_Receiver", propOrder = {
    "authority",
    "contactTypeIdentifier",
    "receiverID"
})
public class P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver {

    @XmlElement(name = "Authority")
    protected String authority;
    @XmlElement(name = "ContactTypeIdentifier")
    protected String contactTypeIdentifier;
    @XmlElement(name = "ReceiverID", required = true)
    protected String receiverID;

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Gets the value of the contactTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeIdentifier() {
        return contactTypeIdentifier;
    }

    /**
     * Sets the value of the contactTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeIdentifier(String value) {
        this.contactTypeIdentifier = value;
    }

    /**
     * Gets the value of the receiverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverID() {
        return receiverID;
    }

    /**
     * Sets the value of the receiverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverID(String value) {
        this.receiverID = value;
    }

}
