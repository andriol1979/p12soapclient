package p12client;

import soapclient.P4CollectedDataBatchRequestEnvelopeCreator;

import javax.xml.datatype.DatatypeConfigurationException;
import java.security.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import nedu.edsn.data.p4collecteddatabatchrequest._2.standard.P4CollectedDataBatchRequestEnvelope;
import nedu.edsn.data.p4collecteddatabatchresponse._2.standard.P4CollectedDataBatchResponseEnvelope;
import nedu.edsn.data.p4collecteddatabatchresultrequest._2.standard.P4CollectedDataBatchResultRequestEnvelope;
import nedu.edsn.data.p4collecteddatabatchresultresponse._2.standard.P4CollectedDataBatchResultResponseEnvelope;
import nedu.edsn.service.p4._2.standard.P4;
import nedu.edsn.service.p4._2.standard.P4PortType;
import nedu.edsn.service.p4._2.standard.SOAPFault;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import soapclient.P4CollectedDataBatchResultRequestEnvelopeCreator;

public class P12SoapClientMainApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(P12SoapClientMainApp.class);

    private static final P4CollectedDataBatchRequestEnvelopeCreator requestEnvelopeCreator = new P4CollectedDataBatchRequestEnvelopeCreator();
    private static final P4CollectedDataBatchResultRequestEnvelopeCreator resultRequestEnvelopeCreator =
            new P4CollectedDataBatchResultRequestEnvelopeCreator();
    
    private static final String XMLNS_WSU = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
    private static final String XSD_WSSE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    
    public static void main(String [] args) throws DatatypeConfigurationException, KeyStoreException, JAXBException, SOAPFault, SOAPException {
        Map<String,Object> outProps = new HashMap<>();
        outProps.put(WSHandlerConstants.ACTION, "Signature");
        outProps.put(WSHandlerConstants.USER, "www.kikker.nl (test kpn pkioverheid private services ca - g1)");
        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordCallback.class.getName());
        outProps.put(WSHandlerConstants.SIG_PROP_FILE, "client_sign.properties");
        outProps.put(WSHandlerConstants.SIG_KEY_ID, "DirectReference");

        //Init client proxy
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(P4PortType.class);
        factory.setAddress(P4.WSDL.replace("?wsdl", ""));
        P4PortType p4Port = (P4PortType)factory.create();
        org.apache.cxf.endpoint.Client client = ClientProxy.getClient(p4Port);
        Endpoint endpoint = client.getEndpoint();
        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
        endpoint.getOutInterceptors().add(wssOut);

//        final List<Header> headers = new ArrayList<>();
//        final SOAPFactory sf = SOAPFactory.newInstance();
//        final SOAPElement securityElement = sf.createElement("Security", "wsse", XSD_WSSE);
//        final SOAPElement authElement = sf.createElement("BinarySecurityToken", "wsse", XSD_WSSE);
//        authElement.setAttribute("ValueType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3");
//        authElement.setAttribute("EncodingType", "wsse:Base64Binary");
//        authElement.setAttribute("wsu:Id", "SecurityToken");
//        authElement.addAttribute(new QName("xmlns:wsu"), XMLNS_WSU);
//        authElement.addTextNode("MIIF1TCCA72gAwIBAgIQIOFhBgXRvMWEeBj042petTANBgkqhkiG9w0BAQsFADBYMQswCQYDVQQGEwJOTDERMA8GA1UECgwIS1BOIEIuVi4xNjA0BgNVBAMMLVRFU1QgS1BOIFBLSW92ZXJoZWlkIFByaXZhdGUgU2VydmljZXMgQ0EgLSBHMTAeFw0xODA2MTgwMDAwMDBaFw0yMTA2MTcyMzU5NTlaMIGfMQswCQYDVQQGEwJOTDEVMBMGA1UECAwMWnVpZCBIb2xsYW5kMRMwEQYDVQQHDApCb2RlZ3JhdmVuMRowGAYDVQQKDBFLaWtrZXIgRW5lcmdpZSBCVjETMBEGA1UECwwKT3BlcmF0aW9uczEbMBkGA1UEBRMSODcxOTMyODAxMTgwNCBFRFNOMRYwFAYDVQQDDA13d3cua2lra2VyLm5sMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvYyruNXIQ8i5FMjEzdvZj+xISrrw1POdMbw81jcZepYlRHLuQ4rczIsZyL+mct79K7hkrkLwGvKvmEPHSlSse3VU16uk+sJZcMvh4Fznu4zRORw4lKd8zo3qSErWlCFzvmYx2TMUQy1VfGuO8wui1iYflyPDQhVgnLf+XIjOYCoUHbfEERfXGidGSya9M6DCKQ4Gcho88YVAkZW0SlZluejzdxIFWerdgqOSyod4aO6LgNC5G4dXvic8q4OLtNTxTWY+QOsr7kACbiCZtgPm+Uigz1vWgMl4cjhT2hFQEUm7JJZOh47U5BbJRV2nVWpxr8dz+Erdt9dg5z2fU4BCWwIDAQABo4IBUTCCAU0wDAYDVR0TAQH/BAIwADBjBgNVHR8EXDBaMFigVqBUhlJodHRwOi8vY3JsLXRlc3QubWFuYWdlZHBraS5jb20vVEVTVEtQTlBLSW92ZXJoZWlkUHJpdmF0ZVNlcnZpY2VzQ0FHMS9MYXRlc3RDUkwuY3JsMA4GA1UdDwEB/wQEAwIDqDBpBgNVHSAEYjBgMF4GBFUdIAAwVjBUBggrBgEFBQcCAjBIGkZPcCBkaXQgY2VydGlmaWNhYXQgaXMgaGV0IENQUyBQS0lvdmVyaGVpZCB2YW4gS1BOIE5JRVQgdmFuIHRvZXBhc3NpbmcuMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAdBgNVHQ4EFgQUpxW1oEbIdzLv+0SUja9urlZfzrowHwYDVR0jBBgwFoAUIO1IQT2CGSUBR1QBUrN9dl2FwKIwDQYJKoZIhvcNAQELBQADggIBAJdng2oUS9lfR2LQZzLLeYTi/l2sUvllEanINiXsPkOkwGAIU2lq3xeodEhICcu189psNW7+F/+z2j3HcgzEaRK8N+TstJX7neZoS3q/+mpToi4mtDxrgqZcu9qVwryUadowYVFrBOOpS2yDR7UjhylMbXaAKaIZREm+FfUnBaXz8QmThl0krpcoNM0hL/qHEPrJ28uDRmZHabgWqx6KfbehO7D5wI69sll6NkylRvvmo7LNVJwiszM601jh3ADsd9nl0mfZZZmK96ScMlMSw8ZKdKifboI1d34/s1mlkEYnCb8jer4eglQRnN+U1+duzRJifcKyfTcmeVXETIyNf2Zh5zQ2HGFNkdJVxl1Yd18XGJxr9o4cfYyjXraYqOxZ0lUY4a2fUKpHCYqQk1p+hcOpRJPFtATnkjy3va3IDiFicrlNLlhccPO3ZAFEjdhgSNl5n+KKzqk49JM0+ffJJMqwFM8TGGW4wsMy8QtSNHgiLZen1+SIBEB6XX/EvwgIP12hz0jBOyevsbdz2DRgZcnMNO7chwE9YVtoAsUpctniv2qVzDYa12p+idvhIocQJOfxN/Vuu/CL2l91ySq4DUkSDv20IRAU+icMmavG4tk0CMFj26jHmP8F2qQWGL35ACMzJVbA1Pe/KEfjdyfz6XTbrRJa7EcgfdiHpZIhjnF9");
//        securityElement.addChildElement(authElement);
//        final SoapHeader securityHeader = new SoapHeader(
//                new QName(null, "Security"), securityElement);
//        headers.add(securityHeader);
//        ((BindingProvider) p4Port).getRequestContext().put(Header.HEADER_LIST, headers);

        //Inject soap logging
        Binding binding = ((BindingProvider)p4Port).getBinding();
        List<Handler> handlerChain = binding.getHandlerChain();
        handlerChain.add(new SOAPLoggingHandler());
        binding.setHandlerChain(handlerChain);

        P4CollectedDataBatchRequestEnvelope request = requestEnvelopeCreator.create();
        P4CollectedDataBatchResponseEnvelope response = p4Port.p4CollectedDataBatchRequest(request);
        LOGGER.info("Response: {}", response);

        P4CollectedDataBatchResultRequestEnvelope resultRequest = resultRequestEnvelopeCreator.create();
        P4CollectedDataBatchResultResponseEnvelope resultResponse = p4Port.p4CollectedDataBatchResultRequest(resultRequest);
        LOGGER.info("Result Response: {}", resultResponse);
    }
}
