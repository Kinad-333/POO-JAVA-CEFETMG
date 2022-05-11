import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;
        String resposta = "s";
        Util util = new Util();

        while(menu.vereficaSeContinua(resposta)){
            System.out.print("|\tMENU\t\t|");
            System.out.print("\n| 1 - Funcionario\t|\n| 2 - Administrativo\t|\n| 3 - Aluno\t\t|\n\t\n\nQual opcao deseja: ");
            opcao = input.nextInt();
            menu.menu(opcao);
            input.nextLine();
            System.out.println("Deseja continuar sim ou nao: ");
            resposta = input.nextLine();
            util.pausa();
            util.limpa();
        }
        menu.salvaArquivo("Funcionario.txt");
        menu.mostra();
        util.pausa();
        util.limpa();
    }
}
