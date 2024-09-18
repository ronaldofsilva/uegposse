
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteMulti {

	public static void main(String a[]) {
		if (a.length<2) {
			System.out.println("Uso: ClienteMulti <endIP> <limite>");
			System.exit(0);
		}
		try {
			System.out.println("[Conectando Servidor...]");
			Socket cliente = new Socket(a[0],1234);
			System.out.println("[Conexão aceita de: "+cliente.getInetAddress().toString()+"]");
			System.out.println("[Enviando limite...]");
			ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
			saida.flush();
			saida.writeObject(new Integer[Integer.parseInt(a[1])]);
			System.out.println("[Recebendo contagem...]");
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String msg;
			do {
				msg = (String) entrada.readObject();
				System.out.println(msg);
			}while (!msg.equals("EOT"));
			cliente.close();
			System.out.println("[Conexão encerrada]");
		}catch (Exception e) {
			System.out.println("Erro!\n"+e.getMessage());
		}
	}

}
