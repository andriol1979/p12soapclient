
package nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard package. 
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

    private final static QName _P4CollectedDataBatchResultRequestEnvelope_QNAME = new QName("urn:nedu:edsn:data:p4collecteddatabatchresultrequest:2:standard", "P4CollectedDataBatchResultRequestEnvelope");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelope }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelope createP4CollectedDataBatchResultRequestEnvelope() {
        return new P4CollectedDataBatchResultRequestEnvelope();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader() {
        return new P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestination }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestination createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestination() {
        return new P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestination();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver() {
        return new P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService() {
        return new P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderManifest }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderManifest createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderManifest() {
        return new P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderManifest();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem() {
        return new P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderSource }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderSource createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderSource() {
        return new P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderSource();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResultRequestEnvelopeP4Content }
     * 
     */
    public P4CollectedDataBatchResultRequestEnvelopeP4Content createP4CollectedDataBatchResultRequestEnvelopeP4Content() {
        return new P4CollectedDataBatchResultRequestEnvelopeP4Content();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P4CollectedDataBatchResultRequestEnvelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link P4CollectedDataBatchResultRequestEnvelope }{@code >}
     */
    @XmlElementDecl(namespace = "urn:nedu:edsn:data:p4collecteddatabatchresultrequest:2:standard", name = "P4CollectedDataBatchResultRequestEnvelope")
    public JAXBElement<P4CollectedDataBatchResultRequestEnvelope> createP4CollectedDataBatchResultRequestEnvelope(P4CollectedDataBatchResultRequestEnvelope value) {
        return new JAXBElement<P4CollectedDataBatchResultRequestEnvelope>(_P4CollectedDataBatchResultRequestEnvelope_QNAME, P4CollectedDataBatchResultRequestEnvelope.class, null, value);
    }

}
