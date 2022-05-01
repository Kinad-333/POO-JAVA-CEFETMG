import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;
public class Dados{
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    public Dados(){}

    public void pegaDados(Docente docente){
        //boolean verefica = true;

        /*while(verefica){
        System.out.print("Deseja continuar sim ou nao: ");
        String resposta = input.nextLine();
        if(verefica = menu.vereficaSeContinua(resposta) == false){
            break;
        }

        }*/

        Console console = System.console();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ID: ");
        String id = input.nextLine();

        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o Email: ");
        String email = input.nextLine();

        String senha  = new String(console.readPassword("Digite sua senha: "));

        docente = new Docente(id, nome, email, senha);
    }
}
