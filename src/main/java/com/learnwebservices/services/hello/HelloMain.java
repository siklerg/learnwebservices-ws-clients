package com.learnwebservices.services.hello;

import helloWS.HelloEndpoint;
import helloWS.HelloEndpointService;
import helloWS.HelloRequest;
import helloWS.HelloResponse;

import java.net.MalformedURLException;
import java.net.URL;

public class HelloMain {

    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

        URL url = new URL("http://www.learnwebservices.com/services/hello?wsdl");
        HelloEndpointService service = new HelloEndpointService(url);
        HelloEndpoint port = service.getHelloEndpointPort();
        HelloRequest request = new HelloRequest();
        request.setName("John Doe");
        HelloResponse response = port.sayHello(request);
        System.out.println(response.getMessage());
    }
}
