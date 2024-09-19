package br.ueg.posse.si.p4;

import java.rmi.Naming;

public class CalculadoraClient {
	public static void main(String[] args) {
        try {
            // Localiza o serviço remoto
            CalculadoraService calculadora = (CalculadoraService) Naming.lookup("rmi://localhost:1099/CalculadoraService");

            // Invoca o método remoto
            double response = calculadora.adicionar(10,30);
            System.out.println("Soma de 10 + 30: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
