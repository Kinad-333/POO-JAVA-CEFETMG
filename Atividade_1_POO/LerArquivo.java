import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LerArquivo {
    //define o objeto 
    String nomeArquivo;

    public LerArquivo(String arquivo){
        nomeArquivo = arquivo;
    }
    //função feita para ler qualquer arquivo 
    public final static void mostraArquivo(String arquivo) throws FileNotFoundException{
        File arquivoN = new File(arquivo);
        Scanner leraquivo = new Scanner(arquivoN);
        while (leraquivo.hasNextLine()){
            System.out.println(leraquivo.nextLine()+"\n");
        }
    }
}
