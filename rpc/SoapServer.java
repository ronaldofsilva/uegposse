package br.ueg.posse.si.p4;

import javax.xml.ws.Endpoint;

public class SoapServer {
    public static void main(String[] args) {
        // Define o endpoint onde o serviço será publicado
        String url = "http://localhost:8080/ws/hello";
        Endpoint.publish(url, new HelloServiceImpl());

        System.out.println("Service is published at: " + url);
    }
}

