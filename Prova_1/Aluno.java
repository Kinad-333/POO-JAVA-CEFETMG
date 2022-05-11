public class Aluno extends Funcionario {
    private String turma;
    public Aluno(String nome,String email, String senha, String cargo,String turma){
        super( nome, email, senha, cargo);
        setTurma(turma);
    }
    public void setTurma(String turma){
        this.turma = turma;
    }

    @Override
    public String toString(){
        String senhaOculta = escondeSenha(senha);
        return String.format("\nAluno\t%s\t%s\t%s\t%s\t%s",nome,email,senhaOculta,cargo,turma);
    }
}
