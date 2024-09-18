package br.ueg.posse.si.p4;

//Cliente.java
import java.io.*;
import java.net.*;

public class Cliente {
 public static void main(String[] args) {
     String servidor = "localhost"; // Pode ser o IP do servidor

     try (Socket socket = new Socket(servidor, 5000)) {
         // Receber a data e hora do servidor
         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         String dataHora = in.readLine();

         // Exibir a data e hora recebida
         System.out.println("Data e hora recebida do servidor: " + dataHora);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
