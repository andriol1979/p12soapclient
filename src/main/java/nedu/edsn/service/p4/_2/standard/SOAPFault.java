
package nedu.edsn.service.p4._2.standard;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-08-07T17:34:06.465+07:00
 * Generated source version: 3.3.7
 */

@WebFault(name = "SOAPFault", targetNamespace = "urn:edsn:edsn:data:soapfault:1:standard")
public class SOAPFault extends Exception {

    private edsn.edsn.data.soapfault._1.standard.SOAPFault soapFault;

    public SOAPFault() {
        super();
    }

    public SOAPFault(String message) {
        super(message);
    }

    public SOAPFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SOAPFault(String message, edsn.edsn.data.soapfault._1.standard.SOAPFault soapFault) {
        super(message);
        this.soapFault = soapFault;
    }

    public SOAPFault(String message, edsn.edsn.data.soapfault._1.standard.SOAPFault soapFault, java.lang.Throwable cause) {
        super(message, cause);
        this.soapFault = soapFault;
    }

    public edsn.edsn.data.soapfault._1.standard.SOAPFault getFaultInfo() {
        return this.soapFault;
    }
}
