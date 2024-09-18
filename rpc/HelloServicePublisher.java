package br.ueg.posse.si.p4;

import javax.xml.ws.Endpoint;

public class HelloServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/hello", new HelloServiceImpl());
        System.out.println("Service is published at http://localhost:8080/ws/hello?wsdl");
    }
}

