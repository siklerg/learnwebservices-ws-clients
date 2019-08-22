
package com.learnwebservices.services.tempconverter;


import com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitRequest;
import com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.learnwebservices.services.hello package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CelsiusToFahrenheitResponse_QNAME = new QName("http://learnwebservices.com/services/tempconverter", "TempConverterResponse");
    private final static QName _CelsiusToFahrenheit_QNAME = new QName("http://learnwebservices.com/services/tempconverter", "TempConverter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.learnwebservices.services.hello
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheit }
     */
    public CelsiusToFahrenheit createCelsiusToFahrenheit() {
        return new CelsiusToFahrenheit();
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheitResponse }
     */
    public CelsiusToFahrenheitResponse createCelsiusToFahrenheitResponse() {
        return new CelsiusToFahrenheitResponse();
    }

    /**
     * Create an instance of {@link com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitResponse }
     */
    public com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitResponse createHelloResponse() {
        return new com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitResponse();
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheitRequest }
     */
    public CelsiusToFahrenheitRequest createCelsiusToFahrenheitRequest() {
        return new CelsiusToFahrenheitRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusToFahrenheitResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://learnwebservices.com/services/hello", name = "SayHelloResponse")
    public JAXBElement<CelsiusToFahrenheitResponse> createSayHelloResponse(CelsiusToFahrenheitResponse value) {
        return new JAXBElement<CelsiusToFahrenheitResponse>(_CelsiusToFahrenheitResponse_QNAME, CelsiusToFahrenheitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusToFahrenheitRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://learnwebservices.com/services/hello", name = "SayHello")
    public JAXBElement<CelsiusToFahrenheitRequest> createSayHello(CelsiusToFahrenheitRequest value) {
        return new JAXBElement<CelsiusToFahrenheitRequest>(_CelsiusToFahrenheit_QNAME, CelsiusToFahrenheitRequest.class, null, value);
    }

}
