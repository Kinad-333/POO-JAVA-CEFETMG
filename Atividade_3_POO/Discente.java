import java.io.Console;
import java.util.Scanner;

public class Discente extends Docente {
    protected String turma;
    public Discente(int id,String nome, String email, String senha, String turma){
        super(id, nome, email, senha);
        this.turma = turma;
    }

    @Override
    public String toString(){
        String senhaOculta = escondeSenha(senha);
        return String.format("Discente\t%d\t%s\t%s\t%s\t%s",id,nome,email,turma,senhaOculta);
    }
}
