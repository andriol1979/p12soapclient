
package nedu.edsn.data.p4collecteddatabatchresponse._2.standard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nedu.edsn.data.p4collecteddatabatchresponse._2.standard package. 
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

    private final static QName _P4CollectedDataBatchResponseEnvelope_QNAME = new QName("urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard", "P4CollectedDataBatchResponseEnvelope");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nedu.edsn.data.p4collecteddatabatchresponse._2.standard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelope }
     * 
     */
    public P4CollectedDataBatchResponseEnvelope createP4CollectedDataBatchResponseEnvelope() {
        return new P4CollectedDataBatchResponseEnvelope();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeader }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeader createP4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeader() {
        return new P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeader();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestination }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestination createP4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestination() {
        return new P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestination();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver createP4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver() {
        return new P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService createP4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService() {
        return new P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderDestinationService();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderManifest }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderManifest createP4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderManifest() {
        return new P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderManifest();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem createP4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem() {
        return new P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderManifestManifestItem();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderSource }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderSource createP4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderSource() {
        return new P4CollectedDataBatchResponseEnvelopeEDSNBusinessDocumentHeaderSource();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeP4Content }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeP4Content createP4CollectedDataBatchResponseEnvelopeP4Content() {
        return new P4CollectedDataBatchResponseEnvelopeP4Content();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection createP4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection() {
        return new P4CollectedDataBatchResponseEnvelopeP4ContentP4Rejection();
    }

    /**
     * Create an instance of {@link P4CollectedDataBatchResponseEnvelopeRejectionP4Type }
     * 
     */
    public P4CollectedDataBatchResponseEnvelopeRejectionP4Type createP4CollectedDataBatchResponseEnvelopeRejectionP4Type() {
        return new P4CollectedDataBatchResponseEnvelopeRejectionP4Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P4CollectedDataBatchResponseEnvelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link P4CollectedDataBatchResponseEnvelope }{@code >}
     */
    @XmlElementDecl(namespace = "urn:nedu:edsn:data:p4collecteddatabatchresponse:2:standard", name = "P4CollectedDataBatchResponseEnvelope")
    public JAXBElement<P4CollectedDataBatchResponseEnvelope> createP4CollectedDataBatchResponseEnvelope(P4CollectedDataBatchResponseEnvelope value) {
        return new JAXBElement<P4CollectedDataBatchResponseEnvelope>(_P4CollectedDataBatchResponseEnvelope_QNAME, P4CollectedDataBatchResponseEnvelope.class, null, value);
    }

}
