package br.ueg.posse.si.p4;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {
	 public static void main(String[] args) {
	        try {
	            // Cria e registra o serviço RMI
	            LocateRegistry.createRegistry(1099); // Porta padrão do RMI
	            CalculadoraService calculadora = new CalculadoraServiceImpl();
	            Naming.rebind("rmi://localhost:1099/CalculadoraService",calculadora);
	            System.out.println("Servidor de calculadora está pronto...");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
