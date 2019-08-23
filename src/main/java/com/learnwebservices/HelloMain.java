package com.learnwebservices;

import com.learnwebservices.services.hello.HelloEndpoint;
import com.learnwebservices.services.hello.HelloEndpointService;
import com.learnwebservices.services.hello.HelloRequest;
import com.learnwebservices.services.hello.HelloResponse;
import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitRequest;
import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitResponse;
import com.learnwebservices.services.tempconverter.TempConverterEndpoint;
import com.learnwebservices.services.tempconverter.TempConverterEndpointService;

import java.net.MalformedURLException;
import java.net.URL;

public class HelloMain {

    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

        // HELLO
        URL urlHello = new URL("http://www.learnwebservices.com/services/hello?wsdl");
        HelloEndpointService service = new HelloEndpointService(urlHello);
        HelloEndpoint port = service.getHelloEndpointPort();
        HelloRequest request = new HelloRequest();
        request.setName("Heki");
        HelloResponse response = port.sayHello(request);
        System.out.println(response.getMessage());

        // TEMPCONVERTER
        URL urlTempConverter = new URL("http://www.learnwebservices.com/services/tempconverter?wsdl");
        TempConverterEndpointService tempConverterEndpointService = new TempConverterEndpointService(urlTempConverter);
        TempConverterEndpoint tempConverterPort = tempConverterEndpointService.getTempConverterEndpointPort();
        CelsiusToFahrenheitRequest celsiusToFahrenheitRequest = new CelsiusToFahrenheitRequest();
        celsiusToFahrenheitRequest.setTemperatureInCelsius(100);
        CelsiusToFahrenheitResponse celsiusToFahrenheitResponse = tempConverterPort.celsiusToFahrenheit(celsiusToFahrenheitRequest);
        System.out.println(celsiusToFahrenheitResponse.getTemperatureInFahrenheit());

    }
}
