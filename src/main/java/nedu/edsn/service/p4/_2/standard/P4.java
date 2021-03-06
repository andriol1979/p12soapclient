package nedu.edsn.service.p4._2.standard;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-08-07T17:34:06.533+07:00
 * Generated source version: 3.3.7
 *
 */
@WebServiceClient(name = "P4",
                  wsdlLocation = "https://pp4-test.edsn.nl/P4BatchVerzoekMeterstand/P4Port?wsdl",
                  targetNamespace = "urn:nedu:edsn:service:p4:2:standard")
public class P4 extends Service {

    public final static String WSDL = "https://pp4-test.edsn.nl/P4BatchVerzoekMeterstand/P4Port?wsdl";
    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:nedu:edsn:service:p4:2:standard", "P4");
    public final static QName P4Port = new QName("urn:nedu:edsn:service:p4:2:standard", "P4Port");
    static {
        URL url = null;
        try {
            url = new URL(WSDL);
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(P4.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", WSDL);
        }
        WSDL_LOCATION = url;
    }

    public P4(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public P4(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public P4() {
        super(WSDL_LOCATION, SERVICE);
    }

    public P4(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public P4(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public P4(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns P4PortType
     */
    @WebEndpoint(name = "P4Port")
    public P4PortType getP4Port() {
        return super.getPort(P4Port, P4PortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns P4PortType
     */
    @WebEndpoint(name = "P4Port")
    public P4PortType getP4Port(WebServiceFeature... features) {
        return super.getPort(P4Port, P4PortType.class, features);
    }

}
