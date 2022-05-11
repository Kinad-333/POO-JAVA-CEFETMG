import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Menu {
    public Menu(){}
    Scanner input = new Scanner(System.in);


    ArrayList <Funcionario>  docente = new ArrayList <Funcionario>();



    public void menu(int opcao){
        Console console = System.console();
        Scanner input = new Scanner(System.in);

        switch(opcao){
            case 1:
                System.out.print("Digite o Cargo: ");
                String cargo = input.nextLine();

                System.out.print("Digite o Nome: ");
                String nome = input.nextLine();

                System.out.print("Digite o Email: ");
                String email = input.nextLine();

                String senha  = new String(console.readPassword("Digite sua senha: "));

                docente.add(new Funcionario(nome, email, senha, cargo));

                break;

            case 2:
                System.out.print("Digite o Cargo: ");
                String cargoA = input.nextLine();

                System.out.print("Digite o Nome: ");
                String nomeG = input.nextLine();

                System.out.print("Digite o Email: ");
                String emailG = input.nextLine();

                System.out.print("Digite o Setor: ");
                String setor = input.nextLine();

                String senhaG  = new String(console.readPassword("Digite sua senha: "));

                docente.add(new Administrativo(nomeG, emailG, senhaG, cargoA, setor));
                break;

            case 3:
            System.out.print("Digite o Cargo: ");
            String cargoAl = input.nextLine();

            System.out.print("Digite o nome: ");
            String nomeD = input.nextLine();

            System.out.print("Digite o Email: ");
            String emailD = input.nextLine();

            System.out.print("Digite o Turma: ");
            String turma = input.nextLine();

            String senhaD  = new String(console.readPassword("Digite sua senha: "));

            docente.add(new Aluno(nomeD, emailD, senhaD, cargoAl, turma));
                break;
            default:
                System.out.println("Opçao invalida");
        }
    }
    public void mostra(){
        for(int i = 0; i < docente.size(); i++){
            System.out.print(docente.get(i)+"\n");
        }
    }
    //----------------------------------------------------------------//
    // PARTE QUE SERIA DE SALVAR O ARQUIVO
    //----------------------------------------------------------------//
    public void salvaArquivo(String nomeArquivo)throws IOException {
            File arquivo = new File(nomeArquivo);
            //ArrayList <String> fun = new ArrayList<String>();
            try(PrintWriter pw = new PrintWriter(arquivo)){
                for(int i = 0; i < docente.size(); i++){
                    pw.println(docente.get(i));
                }
            }catch(IOException ex){
                ex.printStackTrace();
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
