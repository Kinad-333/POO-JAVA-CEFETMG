import java.util.Scanner;
import java.io.IOException;



public class SubstituiPalavra {
    public static void main(String[] args)throws IOException{
        //Scanner scanner = new Scanner(new FileReader(args[0]));
        Scanner in = new Scanner(System.in);
        String palavra, novaPalavra;

        System.out.print("Digite uma palavra: ");
        palavra = in.nextLine();
        System.out.print("Digite a nova palavra: ");
        novaPalavra = in.nextLine();

        Controlador controla = new Controlador();

        controla.modificador(args[0], palavra, novaPalavra);
    }
}