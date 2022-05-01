import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Console;
import java.util.ArrayList;

public class Menu {
    public Menu(){}
    Scanner input = new Scanner(System.in);


    ArrayList <Docente>  docente = new ArrayList <Docente>();

    public void menu(int opcao)throws FileNotFoundException{
        Console console = System.console();
        Scanner input = new Scanner(System.in);

        switch(opcao){
            case 1:
                System.out.print("Digite o ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Digite o nome: ");
                String nome = input.nextLine();

                System.out.print("Digite o Email: ");
                String email = input.nextLine();

                String senha  = new String(console.readPassword("Digite sua senha: "));

                docente.add(new Docente(id, nome, email, senha));

                break;

            case 2:
                System.out.print("Digite o ID: ");
                int idG = input.nextInt();
                input.nextLine();

                System.out.print("Digite o nome: ");
                String nomeG = input.nextLine();

                System.out.print("Digite o Email: ");
                String emailG = input.nextLine();

                System.out.print("Digite o Setor: ");
                String setor = input.nextLine();

                String senhaG  = new String(console.readPassword("Digite sua senha: "));

                docente.add(new Geral(idG, nomeG, emailG, senhaG, setor));
                break;

            case 3:
            System.out.print("Digite o ID: ");
            int idD = input.nextInt();
            input.nextLine();

            System.out.print("Digite o nome: ");
            String nomeD = input.nextLine();

            System.out.print("Digite o Email: ");
            String emailD = input.nextLine();

            System.out.print("Digite o Turma: ");
            String turma = input.nextLine();

            String senhaD  = new String(console.readPassword("Digite sua senha: "));

            docente.add(new Discente(idD, nomeD, emailD, senhaD, turma));
                break;
            case 4:
                Util util = new Util();
                System.out.print("Deseja ler qual arquivo: ");
                String nomeArquivo = input.nextLine();
                File arquivoN = new File(nomeArquivo);
                Scanner lerarquivo = new Scanner(arquivoN);
                while (lerarquivo.hasNextLine()){
                    System.out.println(lerarquivo.nextLine()+"\n");
                }
                util.pausa();
                util.limpa();
                break;
            default:
                System.out.println("Opçao invalida");
                /*int opcaot;
                System.out.print("\n1 - Docente\n2 - Geral\n3 - Discente\n4 - Ler arquivo\nQual opcao deseja: ");
                opcaot = input.nextInt();
                menu(opcaot);*/
        }
    }
    public void mostra(){
        for(int i = 0; i < docente.size(); i++){
            System.out.print(docente.get(i)+"\n");
        }
    }
    public boolean vereficaSeContinua(String resposta){
        switch(resposta){
            case "s":
            case "S":
            case "sim":
            case "Sim":
                return true;
            case "n":
            case "N":
            case "nao":
            case "Nao":
                return false;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        return false;
    }
}
