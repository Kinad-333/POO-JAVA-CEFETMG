import java.io.Console;
import java.util.Scanner;

public class Docente{
    protected String email, nome, senha;
    int id;
    public Docente(int id,String nome, String email, String senha){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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
        String senhaOculta = escondeSenha(senha);
        return String.format("Docente\t%d\t%s\t%s\t%s",id,nome,email,senhaOculta);
    }
}
