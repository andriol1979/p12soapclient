package soapclient;

//import cxf.nedu.edsn.data.p4collecteddatabatchrequest._2.standard.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelope;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelopeP4Content;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelopeP4ContentP4MeteringPoint;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelopeQueryReasonTypeCode;

public class P4CollectedDataBatchRequestEnvelopeCreator {
    public P4CollectedDataBatchRequestEnvelope create() throws DatatypeConfigurationException {
        P4CollectedDataBatchRequestEnvelope envelope = new P4CollectedDataBatchRequestEnvelope();
        P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader header = createHeader();
        P4CollectedDataBatchRequestEnvelopeP4Content content = createContent();

        envelope.setEDSNBusinessDocumentHeader(header);
        envelope.setP4Content(content);
        return envelope;
    }

    private P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader createHeader() throws DatatypeConfigurationException {
        P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader header =
                new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeader();
        XMLGregorianCalendar creationTimeStamp = createXMLGregorianCalendar((GregorianCalendar) GregorianCalendar.getInstance());
        header.setCreationTimestamp(creationTimeStamp);
        header.setMessageID(java.util.UUID.randomUUID().toString());
        //<urn:Destination>
        P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination headerDestination =
                new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestination();
        P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver headerDestinationReceiver =
                new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver();
        headerDestinationReceiver.setReceiverID("8714444444444");
        headerDestinationReceiver.setAuthority("EAN.UCC");
        headerDestinationReceiver.setContactTypeIdentifier("EDSN");
        headerDestination.setReceiver(headerDestinationReceiver);

        //<urn:Source>
        P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource headerSource =
                new P4CollectedDataBatchRequestEnvelopeEDSNBusinessDocumentHeaderSource();
        headerSource.setAuthority("EAN.UCC");
        headerSource.setContactTypeIdentifier("DDQ_O");
        headerSource.setSenderID("8719328011804");

        //Add to header
        header.setDestination(headerDestination);
        header.setSource(headerSource);

        return header;
    }

    private P4CollectedDataBatchRequestEnvelopeP4Content createContent() throws DatatypeConfigurationException {
        P4CollectedDataBatchRequestEnvelopeP4Content content =
                new P4CollectedDataBatchRequestEnvelopeP4Content();
        P4CollectedDataBatchRequestEnvelopeP4ContentP4MeteringPoint meteringPoint =
                new P4CollectedDataBatchRequestEnvelopeP4ContentP4MeteringPoint();
        meteringPoint.setEANID("871687400000010976");
        meteringPoint.setExternalReference("EJL test metering data");
        GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();
        calendar.set(2020, 7, 1);
        XMLGregorianCalendar xmlCalendar = createXMLGregorianCalendar(calendar);
        meteringPoint.setQueryDate(xmlCalendar);
        meteringPoint.setQueryReason(P4CollectedDataBatchRequestEnvelopeQueryReasonTypeCode.DAY);
        content.getP4MeteringPoint().add(meteringPoint);

        return content;
    }

    private XMLGregorianCalendar createXMLGregorianCalendar(GregorianCalendar calendar) throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
    }
}
