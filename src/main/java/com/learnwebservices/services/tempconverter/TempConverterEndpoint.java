package com.learnwebservices.services.tempconverter;

import com.learnwebservices.services.hello.ObjectFactory;
import com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitRequest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "TempConverterEndpoint", targetNamespace = "http://www.learnwebservices.com/services/tempconverter")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface TempConverterEndpoint {

    @WebMethod(operationName = "CelsiusToFahrenheit")
    @WebResult(name = "CelsiusToFahrenheitResponse", targetNamespace = "http://www.learnwebservices.com/services/tempconverter")
    @RequestWrapper(localName = "CelsiusToFahrenheit", targetNamespace = "http://www.learnwebservices.com/services/tempconverter", className = "com.learnwebservices.services.tempconverter.CelsiusToFahrenheit")
    @ResponseWrapper(localName = "CelsiusToFahrenheitResponse", targetNamespace = "http://www.learnwebservices.com/services/tempconverter", className = "com.learnwebservices.services.tempconverter.CelsiusToFahrenheitResponse")
    public com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitResponse celsiusToFahrenheit(
            @WebParam(name = "CelsiusToFahrenheit", targetNamespace = "http://www.learnwebservices.com/services/tempconverter")
                    CelsiusToFahrenheitRequest celsiusToFahrenheitRequest);
}
