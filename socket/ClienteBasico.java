package br.ueg.posse.si.p4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteBasico {
	public static void main(String[] args) throws UnknownHostException, 
	IOException, ClassNotFoundException {
		System.out.println("Conectando servidor...");
		Socket cliente = new Socket("127.0.0.1",3456);
		System.out.println("Conexão aceita de "+cliente.getInetAddress().toString());
		System.out.println("Recebendo mensagens...");
		ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
		String msg;
		do {
			msg = (String)entrada.readObject();
			System.out.println(msg);			
		}while(!msg.equals("EOT"));
		cliente.close();
		System.out.println("Conexão encerrada...");
	}

}
