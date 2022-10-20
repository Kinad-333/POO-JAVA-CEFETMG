import java.util.Scanner;
public class Main{
    public static void main(String args[]) throws NaoParException{
        Scanner in = new Scanner(System.in);
        CalculadoraDePares calcula = new CalculadoraDePares(); 
        int x = in.nextInt();
        int y = in.nextInt();
        try{
        system.out.println("soma: " + calcula.soma(x,y));
        }
        catch(NaoParException e){
            System.out.println(e);
        }
        try{
            System.out.println("subtração: " + calcula.subtrair(x,y));
        }
        catch(NaoParException e){
            System.out.println(e);
        }
        try{
        System.out.println("multiplicação: " + calcula.multiplicar(x,y));
        }
        catch(NaoParException e){
            System.out.println(e);
        }
        try{
        System.out.println("divisão: " + calcula.divir(x,y));
        }
        catch(NaoParException e){
            System.out.println(e);
        }
    }
}
