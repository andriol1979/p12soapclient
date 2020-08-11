
package nedu.edsn.data.p4collecteddatabatchrequest._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentHash" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="ConversationID" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Identifier" minOccurs="0"/&gt;
 *         &lt;element name="CorrelationID" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Identifier" minOccurs="0"/&gt;
 *         &lt;element name="CreationTimestamp" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_DateTime"/&gt;
 *         &lt;element name="DocumentID" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="ExpiresAt" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="MessageID" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Identifier"/&gt;
 *         &lt;element name="ProcessTypeID" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="RepeatedRequest" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Identifier" minOccurs="0"/&gt;
 *         &lt;element name="TestRequest" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_Indicator" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader_Destination"/&gt;
 *         &lt;element name="Manifest" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader_Manifest" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard}P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader_Source"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchRequestEnvelope_EDSNBusinessDocumentHeader", propOrder = {
    "contentHash",
    "conversationID",
    "correlationID",
    "creationTimestamp",
    "documentID",
    "expiresAt",
    "messageID",
    "processTypeID",
    "repeatedRequest",
    "testRequest",
    "destination",
    "manifest",
    "source"
})
public class P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader {

    @XmlElement(name = "ContentHash")
    protected String contentHash;
    @XmlElement(name = "ConversationID")
    protected String conversationID;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "CreationTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimestamp;
    @XmlElement(name = "DocumentID")
    protected String documentID;
    @XmlElement(name = "ExpiresAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiresAt;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "ProcessTypeID")
    protected String processTypeID;
    @XmlElement(name = "RepeatedRequest")
    protected String repeatedRequest;
    @XmlElement(name = "TestRequest")
    protected String testRequest;
    @XmlElement(name = "Destination", required = true)
    protected P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination destination;
    @XmlElement(name = "Manifest")
    protected P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest manifest;
    @XmlElement(name = "Source", required = true)
    protected P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource source;

    /**
     * Gets the value of the contentHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentHash() {
        return contentHash;
    }

    /**
     * Sets the value of the contentHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentHash(String value) {
        this.contentHash = value;
    }

    /**
     * Gets the value of the conversationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationID(String value) {
        this.conversationID = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimestamp(XMLGregorianCalendar value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the expiresAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiresAt() {
        return expiresAt;
    }

    /**
     * Sets the value of the expiresAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiresAt(XMLGregorianCalendar value) {
        this.expiresAt = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the processTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessTypeID() {
        return processTypeID;
    }

    /**
     * Sets the value of the processTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessTypeID(String value) {
        this.processTypeID = value;
    }

    /**
     * Gets the value of the repeatedRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatedRequest() {
        return repeatedRequest;
    }

    /**
     * Sets the value of the repeatedRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatedRequest(String value) {
        this.repeatedRequest = value;
    }

    /**
     * Gets the value of the testRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestRequest() {
        return testRequest;
    }

    /**
     * Sets the value of the testRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestRequest(String value) {
        this.testRequest = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination }
     *     
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination }
     *     
     */
    public void setDestination(P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the manifest property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest }
     *     
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest getManifest() {
        return manifest;
    }

    /**
     * Sets the value of the manifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest }
     *     
     */
    public void setManifest(P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest value) {
        this.manifest = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource }
     *     
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource }
     *     
     */
    public void setSource(P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource value) {
        this.source = value;
    }

}
