import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class Banco {
    String nomeJDBC = "jdbc:mysql://localhost/recursoshumanos";
    String option = "?useTimezone=true&serverTimezone=UTC";
    String user = "root";
    String pass  = "";
    Connection con;

    public Banco(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(nomeJDBC+option, user, pass);
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public void insertBanco(List<Pessoal> lista){
        try{            
            String pedido = "INSERT INTO pessoal(cargo, matricula, nome, email, senha, turma, setor) VALUES(?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(pedido);
            for(Pessoal pessoal : lista){
                st.setString(1, pessoal.cargo);
                st.setInt(2, pessoal.matricula);
                st.setString(3, pessoal.nome);
                st.setString(4, pessoal.email);
                st.setString(5, pessoal.senha);
                st.setString(6, null);
                st.setString(7, null);
                st.execute();
            }
            st.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
   
}
