import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Servidor extends UnicastRemoteObject implements RemoteInterface {
	private Scanner scanner;

	public Servidor() throws RemoteException {
		scanner = new Scanner(System.in);
	}

	@Override
	public String communicate(String msg) throws RemoteException {
		System.out.println("User: " + msg);
		System.out.print("Server: ");
		String answer = "";
		answer = scanner.nextLine();
		if (answer.equalsIgnoreCase("!sair"))
			System.exit(0);
		return answer;
	}

	public static void main(String args[]) {
		Servidor cal;
		try {
			cal = new Servidor();
			LocateRegistry.createRegistry(1099);
			Naming.bind("rmi:///Chat", cal);
			System.out.println("Pronto!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}