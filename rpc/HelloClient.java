package br.ueg.posse.si.p4;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloClient {
    public static void main(String[] args) throws Exception {
        // URL do WSDL do serviço publicado
        URL url = new URL("http://localhost:8080/ws/hello?wsdl");

        // Nome do serviço e do namespace
        QName qname = new QName("http://p4.si.posse.ueg.br/", "HelloServiceImplService");

        // Criação do serviço SOAP
        Service service = Service.create(url, qname);

        // Obtenção do port do serviço
        HelloService helloService = service.getPort(HelloService.class);

        // Chamada do serviço
        String response = helloService.sayHello("World");
        System.out.println("Response from service: " + response);
    }
}
