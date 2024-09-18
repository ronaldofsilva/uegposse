import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorThreaded {
	public static void main(String a[]) throws IOException {
		int idCliente = 0;
		
			System.out.println("[Criando Servidor...]");
			@SuppressWarnings("resource")
			
			ServerSocket servidor = new ServerSocket(1234);
			
			System.out.println("[Servidor operando na porta 1234]");
			
			while (true) {
				System.out.println("[Esperando conexao...]");
				Socket cliente = servidor.accept();
				new Contador2(idCliente++, cliente).start();
			}
		
	}
}