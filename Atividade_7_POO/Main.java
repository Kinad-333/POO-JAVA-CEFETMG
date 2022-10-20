import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.Buffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
    public Main() throws IOException{
        String nomeJDBC = "jdbc:mysql://localhost/discdb";
        String option = "?useTimezone=true&serverTimezone=UTC";
        String nomeUser ="root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(nomeJDBC+option, nomeUser, password);
            Statement st = con.createStatement();
            
            st.executeUpdate("USE discdb");
            
            String pedido = "SELECT musica.titulo, artista.nome FROM musica"+
            " INNER JOIN faixa ON musica.CodMus=faixa.CodMus"+
            " INNER JOIN disco ON disco.CodDisco=faixa.CodDisco"+
            " INNER JOIN artista ON artista.CodArt=disco.CodArt";

            ResultSet rs = st.executeQuery(pedido);
            ResultSetMetaData rsmd = rs.getMetaData();

            int numeroColonas = rsmd.getColumnCount();
            int numeroLinhas = 1;
            OutputStream os = new FileOutputStream("musicas.txt");
            Writer wr = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(wr);
            while(rs.next()){
                System.out.println("Musica N°:"+ numeroLinhas);
                br.write("Musica N°:"+ numeroLinhas + "\r\n");
                for(int col = 1; col <= numeroColonas; col++){
                    System.out.print(rsmd.getColumnLabel(col) + ": ");
                    br.write(rsmd.getColumnLabel(col) + ": ");
                    System.out.println(rs.getString(col));
                    br.write(rs.getString(col)+ "\r\n");
                }
                numeroLinhas++;
                System.out.println("|-----------------------------|");
                br.write("|-----------------------------|" + "\r\n");
            }
            st.close();
            con.close();
            br.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        new Main();
    }
}