
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Manifest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Manifest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberofItems" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_Numeric"/&gt;
 *         &lt;element name="ManifestItem" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Manifest_ManifestItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Manifest", propOrder = {
    "numberofItems",
    "manifestItem"
})
public class P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderManifest {

    @XmlElement(name = "NumberofItems", required = true)
    protected BigDecimal numberofItems;
    @XmlElement(name = "ManifestItem", required = true)
    protected List<P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem> manifestItem;

    /**
     * Gets the value of the numberofItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberofItems() {
        return numberofItems;
    }

    /**
     * Sets the value of the numberofItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberofItems(BigDecimal value) {
        this.numberofItems = value;
    }

    /**
     * Gets the value of the manifestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manifestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManifestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem }
     * 
     * 
     */
    public List<P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem> getManifestItem() {
        if (manifestItem == null) {
            manifestItem = new ArrayList<P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem>();
        }
        return this.manifestItem;
    }

}
