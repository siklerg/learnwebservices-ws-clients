package com.learnwebservices;

import com.learnwebservices.services.hello.HelloEndpoint;
import com.learnwebservices.services.hello.HelloRequest;
import com.learnwebservices.services.hello.HelloResponse;
import com.learnwebservices.services.hello.SimpleHelloEndpointService;

import java.net.MalformedURLException;
import java.net.URL;

public class HelloMain {

    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

        URL url = new URL("http://www.learnwebservices.com/services/hello?wsdl");
        SimpleHelloEndpointService service = new SimpleHelloEndpointService(url);
        HelloEndpoint port = service.getSimpleHelloEndpointPort();
        HelloRequest request = new HelloRequest();
        request.setName("Heki");
        HelloResponse response = port.sayHello(request);
        System.out.println(response.getMessage());
    }
}
