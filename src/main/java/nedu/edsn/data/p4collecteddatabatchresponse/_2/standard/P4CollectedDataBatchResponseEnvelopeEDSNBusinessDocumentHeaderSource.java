
package nedu.edsn.data.p4collecteddatabatchresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResponseEnvelope_EDSNBusinessDocumentHeader_Source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResponseEnvelope_EDSNBusinessDocumentHeader_Source"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authority" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="ContactTypeIdentifier" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="SenderID" type="{urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard}P4CollectedDataBatchResponseEnvelope_Identifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResponseEnvelope_EDSNBusinessDocumentHeader_Source", propOrder = {
    "authority",
    "contactTypeIdentifier",
    "senderID"
})
public class P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderSource {

    @XmlElement(name = "Authority")
    protected String authority;
    @XmlElement(name = "ContactTypeIdentifier")
    protected String contactTypeIdentifier;
    @XmlElement(name = "SenderID", required = true)
    protected String senderID;

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
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderID(String value) {
        this.senderID = value;
    }

}
