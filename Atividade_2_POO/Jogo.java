// Bibliotecas necessarias para uso da janela
import javax.swing.JFrame;

// Classe principal do jogo
public class Jogo{
    // Metodo main principal do sistema 
    public static void main(String[] args){
        //Define um novo painel
        JogoPainel jogoPainel = new JogoPainel();
        //Criação de um novo frame / define o nome da janela
        JFrame jogo = new JFrame("Bolinhas");
        //Adição do painel de frame e possibilitando o fechar o programa pelo "X" 
        jogo.add(jogoPainel);
        jogo.pack();
        jogo.setSize(640, 480);
        jogo.setResizable(false);
        jogo.setVisible(true);
        jogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}