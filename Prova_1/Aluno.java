public class Aluno extends Funcionario {
    protected String turma;
    public Aluno(String email,String nome, String senha, String cargo, String turma){
        super( nome, email, senha, cargo);
        this.turma = turma;
    }

    @Override
    public String toString(){
        String senhaOculta = escondeSenha(senha);
        return String.format("\nAluno\t%s\t%s\t%s\t%s\t%s",nome,email,senhaOculta,cargo,turma);
    }
}
