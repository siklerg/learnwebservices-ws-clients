package com.learnwebservices.services.tempconverter;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "TempConverterEndpointService", targetNamespace = "http://tempconverter.services.learnwebservices.com/", wsdlLocation = "http://www.learnwebservices.com/services/tempconverter?wsdl")
public class TempConverterEndpointService extends Service {
    private final static URL TempConverterEndpointService_WSDL_LOCATION;
    private final static WebServiceException TempConverterEndpointService_EXCEPTION;
    private final static QName TempConverterEndpointService_QNAME = new QName("http://tempconverter.services.learnwebservices.com/", "DelegatingTempConverterEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.learnwebservices.com/services/tempconverter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TempConverterEndpointService_WSDL_LOCATION = url;
        TempConverterEndpointService_EXCEPTION = e;
    }

    public TempConverterEndpointService() {
        super(__getWsdlLocation(), TempConverterEndpointService_QNAME);
    }

    public TempConverterEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TempConverterEndpointService_QNAME, features);
    }

    public TempConverterEndpointService(URL wsdlLocation) {
        super(wsdlLocation, TempConverterEndpointService_QNAME);
    }

    public TempConverterEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TempConverterEndpointService_QNAME, features);
    }

    public TempConverterEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TempConverterEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns TempConverterEndpoint
     */
    @WebEndpoint(name = "DelegatingTempConverterEndpointPort")
    public TempConverterEndpoint getTempConverterEndpointPort() {
        return super.getPort(new QName("http://tempconverter.services.learnwebservices.com/", "DelegatingTempConverterEndpointPort"), TempConverterEndpoint.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns TempConverterEndpoint
     */
    @WebEndpoint(name = "DelegatingTempConverterEndpointPort")
    public TempConverterEndpoint getTempConverterEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempconverter.services.learnwebservices.com/", "DelegatingTempConverterEndpointPort"), TempConverterEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TempConverterEndpointService_EXCEPTION != null) {
            throw TempConverterEndpointService_EXCEPTION;
        }
        return TempConverterEndpointService_WSDL_LOCATION;
    }
}
