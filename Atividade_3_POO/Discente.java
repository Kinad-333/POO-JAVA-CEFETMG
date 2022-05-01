import java.io.Console;
import java.util.Scanner;

public class Discente extends Docente {
    String turma;
    Discente(int novoId,String novoNome, String novoEmail, String novaSenha, String novaTurma){
        this.id = novoId;
        this.nome = novoNome;
        this.email = novoEmail;
        this.senha = novaSenha;
        this.turma = novaTurma;
    }

    @Override
    public String toString(){
        return String.format("VOID");
    }
}
