import java.util.Scanner;
import java.io.Console;
import java.io.FileNotFoundException;


public class ATT1{

    public final static void menu(int resposta)throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        pausa();
        limpa();
        switch(resposta){
            case 1:
                String nomeArquivo;
                System.out.print("Digite o nome do seu arquivo: ");
                nomeArquivo = input.nextLine();
                LerArquivo.mostraArquivo(nomeArquivo);
                pausa();
            break;
            case 2:
                Aluno alunos[] = new Aluno[3];
                pegaDados(alunos);
                mostraDados(alunos);
                pausa();
            break;
        }
    }

    public final static void limpa(){
        System.out.print("\n");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public final static void pausa(){
        Scanner input = new Scanner(System.in);
        System.out.println("Precione qualquer tecla para continuar ...");
        input.nextLine();
    }

    public final static void pegaDados(Aluno alunos[]){

        Console console = System.console();
        Scanner input= new Scanner(System.in);
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
            limpa();
        }
    }

    public final static void mostraDados(Aluno alunos[]){
        int i;
        for(i = 0; i < 3; i++){
            System.out.println( "\nDados Aluno " + (i+1)+": " + alunos[i].mostra());
        }
    };
//FUNÇÃO MAIN
    public static void main(String[] args)throws FileNotFoundException{
        Scanner input = new Scanner(System.in);


        int resposta;
        limpa();
        do{
            limpa();
            System.out.print("\t\t|MENU|\t\t\n");
            System.out.print("|\t1 - Ver arquivo\t\t|\n|\t2 - Digitar os alunos\t|\n|\t3 - sair\t\t|\nQual deseja: ");
            resposta = input.nextInt();
            input.nextLine();
            menu(resposta);
        }while(resposta != 3);
    }
}
