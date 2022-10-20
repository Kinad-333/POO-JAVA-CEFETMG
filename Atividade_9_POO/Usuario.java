import java.rmi.Naming;
import java.util.Scanner;

public class Usuario {
    public Usuario() {}
  
    public static void main(String args[]) {
        RemoteInterface RemoteInterface;
        String msg, answer;
        Scanner scanner = new Scanner(System.in);
        
        try {
            RemoteInterface = (RemoteInterface) Naming.lookup("rmi:///Chat");
    
            do {
                System.out.print("User: ");
                msg = scanner.nextLine();
                answer = RemoteInterface.communicate(msg);
                System.out.println("Server: " + answer);
            } while (!msg.equalsIgnoreCase("!sair"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}