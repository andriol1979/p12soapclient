
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4EnergyMeter_P4Register_P4Reading complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4EnergyMeter_P4Register_P4Reading"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reading" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_ReadingType" minOccurs="0"/&gt;
 *         &lt;element name="ReadingDateTime" type="{urn:nedu:edsn:data:p4collecteddatabatchresultresponse:2:standard}P4CollectedDataBatchResultResponseEnvelope_DateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_P4Content_P4MeteringPoint_P4EnergyMeter_P4Register_P4Reading", propOrder = {
    "reading",
    "readingDateTime"
})
public class P4CollectedDataBatchResultResponseEnvelopeP4ContentP4MeteringPointP4EnergyMeterP4RegisterP4Reading {

    @XmlElement(name = "Reading")
    protected BigDecimal reading;
    @XmlElement(name = "ReadingDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readingDateTime;

    /**
     * Gets the value of the reading property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReading() {
        return reading;
    }

    /**
     * Sets the value of the reading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReading(BigDecimal value) {
        this.reading = value;
    }

    /**
     * Gets the value of the readingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReadingDateTime() {
        return readingDateTime;
    }

    /**
     * Sets the value of the readingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReadingDateTime(XMLGregorianCalendar value) {
        this.readingDateTime = value;
    }

}
