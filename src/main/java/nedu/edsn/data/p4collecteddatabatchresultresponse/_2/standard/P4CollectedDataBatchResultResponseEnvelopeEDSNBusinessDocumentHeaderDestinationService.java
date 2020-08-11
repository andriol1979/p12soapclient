
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Destination_Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Destination_Service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceMethod" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_Text" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_EDSNBusinessDocumentHeader_Destination_Service", propOrder = {
    "serviceMethod",
    "serviceName"
})
public class P4CollectedDataBatchResultResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService {

    @XmlElement(name = "ServiceMethod")
    protected String serviceMethod;
    @XmlElement(name = "ServiceName")
    protected String serviceName;

    /**
     * Gets the value of the serviceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMethod() {
        return serviceMethod;
    }

    /**
     * Sets the value of the serviceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMethod(String value) {
        this.serviceMethod = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

}
