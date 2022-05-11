import java.util.Scanner;

class Util{
    public Util(){
    }

    public void limpa(){
        System.out.print("\n");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void pausa(){
        Scanner input = new Scanner(System.in);
        System.out.println("Precione qualquer tecla para continuar ...");
        input.nextLine();
    }
    
}
