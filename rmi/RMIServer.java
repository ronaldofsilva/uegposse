package br.ueg.posse.si.p4;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Cria e registra o serviço RMI
            LocateRegistry.createRegistry(1099); // Porta padrão do RMI
            HelloService helloService = new HelloServiceImpl();
            Naming.rebind("rmi://localhost:1099/HelloService", helloService);
            System.out.println("Servidor RMI está pronto...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}