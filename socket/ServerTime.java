package br.ueg.posse.si.p4;

//Servidor.java
import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServidorDataHora {
 public static void main(String[] args) {
     try (ServerSocket serverSocket = new ServerSocket(5000)) {
         System.out.println("Servidor aguardando conexão...");

         while (true) {
             // Aceitando a conexão do cliente
             Socket socket = serverSocket.accept();
             System.out.println("Cliente conectado.");

             // Obter a data e hora atual
             LocalDateTime agora = LocalDateTime.now();
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
             String dataHora = agora.format(formatter);

             // Enviar a data e hora ao cliente
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             out.println(dataHora);

             // Fechar a conexão
             socket.close();
             System.out.println("Data e hora enviada: " + dataHora);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

