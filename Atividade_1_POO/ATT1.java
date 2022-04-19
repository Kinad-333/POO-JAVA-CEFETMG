import java.util.Scanner;
import java.io.Console;
import java.io.FileNotFoundException;


public class ATT1{

//FUNÇÃO MAIN
    public static void main(String[] args)throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Util util = new Util();

        int resposta;
        util.limpa();
        do{
            util.limpa();
            System.out.print("\t\t|MENU|\t\t\n");
            System.out.print("|\t1 - Ver arquivo\t\t|\n|\t2 - Digitar os alunos\t|\n|\t3 - sair\t\t|\nQual deseja: ");
            resposta = input.nextInt();
            input.nextLine();
            menu.menu(resposta);
        }while(resposta != 3);
    }
}

class Menu{
    public Menu(){
    }
    public void menu(int resposta) throws FileNotFoundException {
        LerArquivo ler = new LerArquivo();
        Util util = new Util();
        Scanner input = new Scanner(System.in);
        Dados dado = new Dados();

        util.pausa();
        util.limpa();
        switch(resposta){
            case 1:
                String nomeArquivo;
                System.out.print("Digite o nome do seu arquivo: ");
                nomeArquivo = input.nextLine();
                ler.mostraArquivo(nomeArquivo);
                util.pausa();
            break;
            case 2:
                Aluno alunos[] = new Aluno[3];
                dado.pegaDados(alunos);
                dado.mostraDados(alunos);
                util.pausa();
            break;
        }
    }
}

class Dados{
    public Dados(){
    }
    public void mostraDados(Aluno alunos[]){
        int i;
        for(i = 0; i < 3; i++){
            System.out.println( "\nDados Aluno " + (i+1)+": " + alunos[i].mostra());
        }
    }

    public void pegaDados(Aluno alunos[]){


        Console console = System.console();
        Scanner input= new Scanner(System.in);
        Util util = new Util();

        int i;

        for(i = 0; i < 3; i++){

            System.out.print("Digite a nome "+ (i+1) + "º aluno:");
            String nome = input.nextLine();

            String senha = new String(console.readPassword("Digite a senha "+ (i+1) + "º aluno: "));


            System.out.print("Digite a matricula "+ (i+1) + "º aluno: ");
            int matricula = input.nextInt();

            System.out.print("Digite a grupo "+ (i+1)+ "º aluno:");
            int grupo = input.nextInt();

            System.out.print("Digite a subturma "+ (i+1) + "º aluno: ");
            int subTurma = input.nextInt();

            input.nextLine();

            Aluno aluno = new Aluno(matricula, grupo, subTurma, nome, senha);
            alunos[i] = aluno;
            util.limpa();
        }
    }
}
