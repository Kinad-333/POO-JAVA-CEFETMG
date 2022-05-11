public class Administrativo extends Funcionario {
    private String setor;
    public Administrativo(String nome,String email, String senha, String cargo, String setor){
        super(nome, email, senha, cargo);
        setSetor(setor);
    }
    public void setSetor(String setor) {
        if(setor.equals("Biblioteca")||setor.equals("Estagio")||setor.equals("Secretaria")){
            this.setor = setor;
        }
        else{
            this.setor = "NULL";
        }
    }
    @Override
    public String toString(){
        String senhaOculta = escondeSenha(senha);
        return String.format("\nAdminitrativo\t%s\t%s\t%s\t%s\t%s",nome,email,senhaOculta,cargo, setor);
    }
}
