import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class PesquisaArquivo {
    public static void main(String[] args)throws FileNotFoundException{
        //Scanner scanner = new Scanner(new FileReader(args[0]));
        Scanner in = new Scanner(System.in);
        String palavra;
        int valor = 0;

        System.out.print("Digite uma palavra: ");
        palavra = in.nextLine();

        Controlador controla = new Controlador();

        valor = controla.leitor(args[0], palavra);

        System.out.println("Seu tamanho e esse: "+ valor);
    }
}
