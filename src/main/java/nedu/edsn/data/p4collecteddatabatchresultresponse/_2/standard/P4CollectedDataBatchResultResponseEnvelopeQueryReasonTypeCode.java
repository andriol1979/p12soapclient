
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_QueryReasonTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="P4CollectedDataBatchResultResponseEnvelope_QueryReasonTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="RCY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_QueryReasonTypeCode")
@XmlEnum
public enum P4CollectedDataBatchResultResponseEnvelopeQueryReasonTypeCode {


    /**
     * Dagstand
     * 
     */
    DAY,

    /**
     * Intervalstand
     * 
     */
    INT,

    /**
     * Maandstand recovery
     * 
     */
    RCY;

    public String value() {
        return name();
    }

    public static P4CollectedDataBatchResultResponseEnvelopeQueryReasonTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
