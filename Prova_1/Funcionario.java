public class Funcionario{
    protected String email, nome, senha, cargo;
    public Funcionario(String email,String nome, String senha, String cargo){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
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
        return String.format("\nFuncionario\t%s\t%s\t%s\t%s",nome,email,senhaOculta,cargo);
    }
}
