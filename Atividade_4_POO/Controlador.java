import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Controlador {
    public Controlador(){

    }

    public int leitor(String nomeArquivo, String palavra)  throws FileNotFoundException{
        int valor = 0;
        Scanner in = new Scanner(new FileReader(nomeArquivo));
        while (in.hasNext()){
            String linha = in.next();
            String[] line = linha.split(" ");
            int arrTamanho = line.length;
            for(int i = 0; i < arrTamanho;i++){
                if(line[i].equals(palavra)){
                    valor++;
                    break;
                }
            }
        }
        return valor;
    }
    public void modificador(String nomeArquivo, String palavra, String novaPalavra)  throws IOException {
        File arquivoModificado = new File(nomeArquivo);
        FileWriter escrita = null;
        BufferedReader reader = null;
        String conteudoAntigo = "";

        try{
            reader = new BufferedReader(new FileReader(arquivoModificado));

            String linha = reader.readLine();

            while(linha != null){
                conteudoAntigo = conteudoAntigo + linha + System.lineSeparator();
                linha = reader.readLine();
            }
            String novoConteudo = conteudoAntigo.replaceAll(palavra, novaPalavra);

            escrita = new FileWriter(arquivoModificado);
            escrita.write(novoConteudo);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                reader.close();
                escrita.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
