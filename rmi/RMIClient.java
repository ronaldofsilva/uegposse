package br.ueg.posse.si.p4;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Localiza o serviço remoto
            HelloService helloService = (HelloService) Naming.lookup("rmi://localhost:1099/HelloService");

            // Invoca o método remoto
            String response = helloService.sayHello("World");
            System.out.println("Resposta do servidor: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
