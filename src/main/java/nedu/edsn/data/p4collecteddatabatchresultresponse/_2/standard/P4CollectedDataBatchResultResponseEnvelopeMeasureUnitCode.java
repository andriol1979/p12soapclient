
package nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P4CollectedDataBatchResultResponseEnvelope_MeasureUnitCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="P4CollectedDataBatchResultResponseEnvelope_MeasureUnitCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KVR"/&gt;
 *     &lt;enumeration value="KWH"/&gt;
 *     &lt;enumeration value="KWT"/&gt;
 *     &lt;enumeration value="M3N"/&gt;
 *     &lt;enumeration value="MTQ"/&gt;
 *     &lt;enumeration value="WH"/&gt;
 *     &lt;enumeration value="DM3"/&gt;
 *     &lt;enumeration value="MJ"/&gt;
 *     &lt;enumeration value="M3N3517"/&gt;
 *     &lt;enumeration value="M3N3517HR"/&gt;
 *     &lt;enumeration value="MQH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "P4CollectedDataBatchResultResponseEnvelope_MeasureUnitCode")
@XmlEnum
public enum P4CollectedDataBatchResultResponseEnvelopeMeasureUnitCode {


    /**
     * kVAR
     * De voltampère reactief (var) is de eenheid van reactief vermogen (P<sub>r</sub>) ook wel bekend als Blind vermogen (P<sub>bl</sub>)
     * 
     */
    KVR("KVR"),

    /**
     * kilowatt hour (kilowattuur kWh)
     * 
     */
    KWH("KWH"),

    /**
     * kilowatt (kW)
     * 
     */
    KWT("KWT"),

    /**
     * normal cubic metre
     * 
     */
    @XmlEnumValue("M3N")
    M_3_N("M3N"),

    /**
     * cubic metre
     * 
     */
    MTQ("MTQ"),

    /**
     * watt hour
     * 
     */
    WH("WH"),

    /**
     * cubic decimetre
     * 
     */
    @XmlEnumValue("DM3")
    DM_3("DM3"),

    /**
     * megajoule
     * 
     */
    MJ("MJ"),

    /**
     * Groningen-gas equivalent is m3(n;35,17)
     * 
     */
    @XmlEnumValue("M3N3517")
    M_3_N_3517("M3N3517"),

    /**
     * Gasafname in m3(n;35,17)/uur
     * 
     */
    @XmlEnumValue("M3N3517HR")
    M_3_N_3517_HR("M3N3517HR"),

    /**
     * Kubieke meter per uur
     * 
     */
    MQH("MQH");
    private final String value;

    P4CollectedDataBatchResultResponseEnvelopeMeasureUnitCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static P4CollectedDataBatchResultResponseEnvelopeMeasureUnitCode fromValue(String v) {
        for (P4CollectedDataBatchResultResponseEnvelopeMeasureUnitCode c: P4CollectedDataBatchResultResponseEnvelopeMeasureUnitCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
