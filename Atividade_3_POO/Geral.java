import java.io.Console;
import java.util.Scanner;

public class Geral extends Docente {
    protected  String setor;
    public Geral(int id,String nome, String email, String senha, String setor){
        super(id, nome, email, senha);
        this.setor = setor;
    }

    @Override
    public String toString(){
        String senhaOculta = escondeSenha(senha);
        return String.format("Geral\t%d\t%s\t%s\t\t%s\t%s",id,nome,email,setor,senhaOculta);
    }
}
