package br.ueg.posse.si.p4;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorBasico {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(3456);
		System.out.println("Servidor operando na porta 3456...");
		while (true) {
			System.out.println("Aguardando conexão...");
			Socket cliente = servidor.accept();
			System.out.println("Conexão aberta de "+cliente.getInetAddress().toString());
			System.out.println("Enviando dados...");
			ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
			saida.flush();
			saida.writeObject("Servidor básico conectado...");
			saida.writeObject("Dados da conexão: "+cliente.toString());
			saida.writeObject("Até +");
			System.out.println("Dados enviados...");
			saida.writeObject("EOT");
			cliente.close();
			System.out.println("Conexão encerrada...");
		}
	}
}
