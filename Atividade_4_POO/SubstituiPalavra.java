import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class SubstituiPalavra {
    public static void main(String[] args)throws FileNotFoundException{
        //Scanner scanner = new Scanner(new FileReader(args[0]));
        Scanner in = new Scanner(System.in);
        String palavra, novaPalavra;
        int valor = 0;

        System.out.print("Digite uma palavra: ");
        palavra = in.nextLine();
        System.out.print("Digite a nova palavra: ");
        novaPalavra = in.nextLine();

        Controlador controla = new Controlador();

        controla.modificador(args[0], palavra, novaPalavra);
    }
}