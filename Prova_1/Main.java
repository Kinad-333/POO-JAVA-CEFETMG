import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        Util util = new Util();

        Funcionario funcionario = new Funcionario("Ada Trayte", "atrayte5@ox.ac.uk","BOGZLTh", "Docente");
        Funcionario aluno = new Aluno("Adel Comberbach", "adelcomberbach22@4shared.com","5wCOkfmLr", "Discente", "CAM2");
        Funcionario admin = new Administrativo("Addy Pandie", "apandie2l@friendfeed.com", "0lMh6C7XNey","Geral","Estagio");

        System.out.println("Dados\n");
        System.out.print(aluno);
        System.out.print(funcionario);
        System.out.print(admin);
        util.pausa();
        util.limpa();
        File arquivo = new File("Funcionario.txt");

        try(PrintWriter pw = new PrintWriter(arquivo)){
            pw.print(aluno);
            pw.print(funcionario);
            pw.print(admin);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        System.out.print("Gravado com sucesso!");
        util.pausa();
        util.limpa();
    }
}
