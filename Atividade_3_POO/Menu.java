import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Console;
import java.util.ArrayList;

public class Menu {
    public Menu(){}
    Scanner input = new Scanner(System.in);


    //ArrayList <Docente>  docente = new ArrayList <Docente>();
    Dados dados = new Dados();
    public void menu(int opcao){

        switch(opcao){
            case 1:

                Docente docente = null;
                dados.pegaDados(docente);
                docente.toString();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opçao invalida");
        }
    }
    public void lerArquivo(String arquivo) throws FileNotFoundException{
            File novoArquivo = new File(arquivo);
            Scanner lerArquivo = new Scanner(novoArquivo);
            while(lerArquivo.hasNextLine()){
                System.out.println(lerArquivo.nextLine()+ "\n");
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
