
package nedu.edsn.data.p4collecteddatabatchrequest._2.standard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nedu.edsn.data.p4collecteddatabatchrequest._2.standard package. 
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

    private final static QName _P4CollectedDataBatchRequestEnvelope_QNAME = new QName("urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard", "P4CollectedDataBatchRequestEnvelope");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nedu.edsn.data.p4collecteddatabatchrequest._2.standard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelope }
     * 
     */
    public P4CollectedDataBatchRequestEnvelope createP4CollectedDataBatchRequestEnvelope() {
        return new P4CollectedDataBatchRequestEnvelope();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader createP4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader() {
        return new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination createP4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination() {
        return new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver createP4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver() {
        return new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService createP4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService() {
        return new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationService();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest createP4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest() {
        return new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifest();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem createP4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem() {
        return new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource createP4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource() {
        return new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeP4Content }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeP4Content createP4CollectedDataBatchRequestEnvelopeP4Content() {
        return new P4CollectedDataBatchRequestEnvelopeP4Content();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchRequestEnvelopeP4ContentP4MeteringPoint }
     * 
     */
    public P4CollectedDataBatchRequestEnvelopeP4ContentP4MeteringPoint createP4CollectedDataBatchRequestEnvelopeP4ContentP4MeteringPoint() {
        return new P4CollectedDataBatchRequestEnvelopeP4ContentP4MeteringPoint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P4CollectedDataBatchRequestEnvelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link P4CollectedDataBatchRequestEnvelope }{@code >}
     */
    @XmlElementDecl(namespace = "urn:nedu:edsn:data:p4collecteddatabatchrequest:2:standard", name = "P4CollectedDataBatchRequestEnvelope")
    public JAXBElement<P4CollectedDataBatchRequestEnvelope> createP4CollectedDataBatchRequestEnvelope(P4CollectedDataBatchRequestEnvelope value) {
        return new JAXBElement<P4CollectedDataBatchRequestEnvelope>(_P4CollectedDataBatchRequestEnvelope_QNAME, P4CollectedDataBatchRequestEnvelope.class, null, value);
    }

}
