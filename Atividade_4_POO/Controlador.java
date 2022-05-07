import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Controlador {
    public Controlador(){

    }

    public int leitor(String nomeArquivo, String palavra)  throws FileNotFoundException{
        int valor = 0;
        Scanner in = new Scanner(new FileReader(nomeArquivo));
        while (in.hasNextLine()){
            String linha = in.next();
            String[] line = linha.split(" ");
            int arrTamanho = line.length;
            for(int i = 0; i < arrTamanho;i++){
                System.out.println(line[i]);
                if(line[i].equals(palavra)){
                    valor++;
                    break;
                }
            }
        }
        return valor;
    }
    public void modificador(String nomeArquivo, String palavra, String novaPalavra)  throws FileNotFoundException{
        int valor = 0;
        Scanner in = new Scanner(new FileReader(nomeArquivo));

        while (in.hasNextLine()){
            String linha = in.nextLine();
            String[] line = linha.split(" ");

            for(String lines : line){
                if(line[0].equals(palavra)){
                    line[0].replaceAll(palavra, novaPalavra);
                    break;
                }
                else{
                    System.out.print("ERROR!");
                }
            }
            System.out.print("Sucesso!");
        }
    }
}
