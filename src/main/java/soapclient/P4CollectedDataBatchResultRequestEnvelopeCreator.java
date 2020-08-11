/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapclient;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard.ObjectFactory;
import nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard.P4CollectedDataBatchResultRequestEnvelope;
import nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard.P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader;
import nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard.P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestination;
import nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard.P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver;
import nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard.P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderSource;
import nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard.P4CollectedDataBatchResultRequestEnvelopeP4Content;

/**
 *
 * @author vutran
 */
public class P4CollectedDataBatchResultRequestEnvelopeCreator {
    ObjectFactory resultRequestFactory = new ObjectFactory();

    public P4CollectedDataBatchResultRequestEnvelope create() throws DatatypeConfigurationException {
        P4CollectedDataBatchResultRequestEnvelope envelope = resultRequestFactory.createP4CollectedDataBatchResultRequestEnvelope();
        P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader header = createHeader();
        P4CollectedDataBatchResultRequestEnvelopeP4Content content = resultRequestFactory.createP4CollectedDataBatchResultRequestEnvelopeP4Content();

        envelope.setEDSNBusinessDocumentHeader(header);
        envelope.setP4Content(content);
        return envelope;
    }

    private P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader createHeader() throws DatatypeConfigurationException {
        P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader header =
                resultRequestFactory.createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeader();
        XMLGregorianCalendar creationTimeStamp = createXMLGregorianCalendar((GregorianCalendar) GregorianCalendar.getInstance());
        header.setCreationTimestamp(creationTimeStamp);
        header.setMessageID(java.util.UUID.randomUUID().toString());
        //<urn:Destination>
        P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestination headerDestination =
                resultRequestFactory.createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestination();
        P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver headerDestinationReceiver =
                resultRequestFactory.createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderDestinationReceiver();
        headerDestinationReceiver.setReceiverID("8714444444444");
        headerDestinationReceiver.setAuthority("EAN.UCC");
        headerDestinationReceiver.setContactTypeIdentifier("EDSN");
        headerDestination.setReceiver(headerDestinationReceiver);

        //<urn:Source>
        P4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderSource headerSource =
                resultRequestFactory.createP4CollectedDataBatchResultRequestEnvelopeEDSNBusinessDocumentHeaderSource();
        headerSource.setAuthority("EAN.UCC");
        headerSource.setContactTypeIdentifier("DDQ_O");
        headerSource.setSenderID("8719328011804");

        //Add to header
        header.setDestination(headerDestination);
        header.setSource(headerSource);

        return header;
    }

    private XMLGregorianCalendar createXMLGregorianCalendar(GregorianCalendar calendar) throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
    }
}
