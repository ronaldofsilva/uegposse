import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

class Contador2 extends Thread {
	private Socket conexao; // conexão com cliente remoto
	private int idCliente; // id do cliente remoto

	public Contador2(int idCliente, Socket conexao) {
		this.idCliente = idCliente;
		this.conexao = conexao;
	}

	public void run() {
		System.out.printf("[%d: Conexao aberta de: %s]\n", idCliente, conexao.getInetAddress().toString());
		try (ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
				ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());) {
			saida.flush();
			System.out.printf("[%d: Recebendo Limite...]\n", idCliente);
			Integer limite = (Integer) entrada.readObject(); // recebe limite
			System.out.printf("[%d: Limite = %d]\n", idCliente, limite);
			for (int i = limite.intValue(); i >= 0; i--) { // envia contagem
				saida.writeObject(idCliente + ": " + i); // Strings
			}
			saida.writeObject("EOT");
			conexao.close();
			System.out.printf("[%d: Conexao encerrada]\n", idCliente);
		} catch (IOException e) {
			System.out.printf("[%d: Erro I/O]\n", idCliente);
		} // fechamento implícito das streams entrada e saída
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}