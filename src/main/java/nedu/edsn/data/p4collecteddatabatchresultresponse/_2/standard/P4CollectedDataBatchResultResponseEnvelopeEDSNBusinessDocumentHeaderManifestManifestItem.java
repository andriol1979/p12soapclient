
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Manifest_ManifestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Manifest_ManifestItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="MimeTypeQualifierCode" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_Text"/&gt;
 *         &lt;element name="UniformResourceIdentifier" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Manifest_ManifestItem", propOrder = {
    "description",
    "languageCode",
    "mimeTypeQualifierCode",
    "uniformResourceIdentifier"
})
public class P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "MimeTypeQualifierCode", required = true)
    protected String mimeTypeQualifierCode;
    @XmlElement(name = "UniformResourceIdentifier", required = true)
    protected String uniformResourceIdentifier;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the mimeTypeQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeTypeQualifierCode() {
        return mimeTypeQualifierCode;
    }

    /**
     * Sets the value of the mimeTypeQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeTypeQualifierCode(String value) {
        this.mimeTypeQualifierCode = value;
    }

    /**
     * Gets the value of the uniformResourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniformResourceIdentifier() {
        return uniformResourceIdentifier;
    }

    /**
     * Sets the value of the uniformResourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniformResourceIdentifier(String value) {
        this.uniformResourceIdentifier = value;
    }

}
