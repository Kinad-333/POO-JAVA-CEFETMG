import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;
        System.out.print("Qual você deseja adicionar: \n1 - Docente\n2 - Geral\n3 - Discente\n");
        opcao = input.nextInt();
        String resposta = "s";

        while(menu.vereficaSeContinua(resposta)){
            menu.menu(opcao);
            input.nextLine();
            System.out.println("Deseja continuar sim ou nao: ");
            resposta = input.nextLine();
        }
    }
}
