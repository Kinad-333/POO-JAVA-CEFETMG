import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class LerArquivo {
    //define o objeto

    public LerArquivo(){
    }
    //função feita para ler qualquer arquivo
    public void mostraArquivo(String arquivo) throws FileNotFoundException{
        File arquivoN = new File(arquivo);
        Scanner lerarquivo = new Scanner(arquivoN);
        while (lerarquivo.hasNextLine()){
            System.out.println(lerarquivo.nextLine()+"\n");
        }
    }
}
