
package edsn.edsn.data.soapfault._1.standard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edsn.edsn.data.soapfault._1.standard package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SOAPFault_QNAME = new QName("urn:edsn:edsn:data:soapfault:1:standard", "SOAPFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edsn.edsn.data.soapfault._1.standard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SOAPFault }
     * 
     */
    public SOAPFault createSOAPFault() {
        return new SOAPFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SOAPFault }{@code >}
     */
    @XmlElementDecl(namespace = "urn:edsn:edsn:data:soapfault:1:standard", name = "SOAPFault")
    public JAXBElement<SOAPFault> createSOAPFault(SOAPFault value) {
        return new JAXBElement<SOAPFault>(_SOAPFault_QNAME, SOAPFault.class, null, value);
    }

}
