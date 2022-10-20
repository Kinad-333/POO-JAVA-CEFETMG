import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PessoalDAOImpl  implements PessoalDAO{
    private Connection connection;
    private Statement st;
    private ResultSet rs;
    private List<Pessoal> ListaPessoal = new ArrayList<Pessoal>();

    public void abreConexao(){ 
        try {
            String nomeJDBC = "jdbc:mysql://localhost/";
            String nomeUser = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(nomeJDBC, nomeUser, password);
            st = this.connection.createStatement();
			st.executeUpdate("USE " + "bd_pessoal");
        } catch (ClassNotFoundException | SQLException e) {			
            e.printStackTrace();
        }
    }
    
    public void fechaConexao(){
        try{
            this.connection.close();
        }catch(SQLException e) {			
            e.printStackTrace();
        }
    }

    @Override
    public List<Pessoal> getAllPessoal() {
        Pessoal pessoa;
        try{
            String pedido = "Select * From pessoal;";
            st.executeUpdate("USE " + "bd_pessoal");
            rs = st.executeQuery(pedido);
            while (rs.next()) {
                int matricula = rs.getInt("matricula");
                String nome  = rs.getString("nome");
                String cargo = rs.getString("cargo");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                String turma = rs.getString("turma");
                String setor = rs.getString("setor");
                if(turma != ""){
                    pessoa = new Aluno(cargo, matricula, nome, email, senha, turma);
                }
                else if(setor != ""){
                    pessoa = new Administrativo(cargo, matricula, nome, email, senha, setor);
                }
                else{
                    pessoa = new Professor(cargo, matricula, nome, email, senha);
                }
                ListaPessoal.add(pessoa);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ListaPessoal;
    }
    
}
