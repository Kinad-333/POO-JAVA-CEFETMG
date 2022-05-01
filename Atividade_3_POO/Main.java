import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;
        String resposta = "s";
        Util util = new Util();

        while(menu.vereficaSeContinua(resposta)){
            System.out.print("|\tMENU\t|");
            System.out.print("\n| 1 - Docente\t|\n| 2 - Geral\t|\n| 3 - Discente\t|\n| 4 - Arquivo\t|\n|---------------|\nQual opcao deseja: ");
            opcao = input.nextInt();
            menu.menu(opcao);
            input.nextLine();
            System.out.println("Deseja continuar sim ou nao: ");
            resposta = input.nextLine();
            util.pausa();
            util.limpa();
        }
        //System.out.println("CARGO\tID\tNOME\tEMAIL\tTURMA\tSETOR\tSENHA");
        menu.mostra();
        util.pausa();
        util.limpa();
    }
}
