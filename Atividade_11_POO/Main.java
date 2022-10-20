import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PessoalDAOImpl dao = new PessoalDAOImpl();
        List<Pessoal> ListaPessoal = new ArrayList<Pessoal>();
        dao.abreConexao();
        ListaPessoal = dao.getAllPessoal();
        for(int i = 0; i < ListaPessoal.size();i++){
            System.out.println(ListaPessoal.get(i));
        }
        dao.fechaConexao();
    }
}
