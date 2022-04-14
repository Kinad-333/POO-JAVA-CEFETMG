class Aluno{
    int matricula, grupo, subTurma;
    String nome;
    String senha;
    public Aluno(int matriculaNova, int grupoNovo, int subTurmaNova, String nomeNovo, String senhaNova){
        matricula = matriculaNova;
        nome = nomeNovo;
        grupo = grupoNovo;
        subTurma = subTurmaNova;
        senha = senhaNova;

    }
    public String mostra(){
        
        String dados = "\n Nome: " + nome + "\n Senha: "+ senhaOculta(senha) + "\n Matricula: " + matricula + "\n Turma: " + subTurma + "\n Grupo: " + grupo + "\n";
        return dados;
    }
    public String senhaOculta(String senha){
        String senhaOCulta = "";
        for(int i = 0; i < senha.length(); i++){
            senhaOCulta += "*";
        }
        return senhaOCulta;
    }

}