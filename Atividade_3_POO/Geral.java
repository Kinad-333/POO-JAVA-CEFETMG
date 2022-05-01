import java.io.Console;
import java.util.Scanner;
public class Geral extends Docente {
    protected  String setor;
    public Geral(){}
    protected  void PegaDados() {
        Console console = System.console();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID: ");
        id = input.nextInt();
        input.nextLine();

        System.out.println("Digite o nome: ");
        nome = input.nextLine();

        System.out.println("Digite o Email: ");
        email = input.nextLine();

        System.out.println("Digite a Turma: ");
        setor = input.nextLine();

        senha  = new String(console.readPassword("Digite sua senha: "));
    }
}
