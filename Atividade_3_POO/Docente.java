import java.io.Console;
import java.util.Scanner;

public class Docente{
    protected String email, nome, senha, id;
    public Docente(String novoId,String novoNome, String novoEmail, String novaSenha){
        this.id = novoId;
        this.nome = novoNome;
        this.email = novoEmail;
        this.senha = novaSenha;
    }
    protected String escondeSenha(String senha) {
        String senhaOculta = "";
        for(int i = 0; i < senha.length(); i++) {
            senhaOculta += "*";
        }
        return senhaOculta;
    }

    @Override
    public String toString(){
        return String.format("'%s'",id);
    }
}
