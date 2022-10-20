import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Seletor extends JFrame {
  private JComboBox combo;
  private JCheckBox backgroung, foreground;
  private JButton continuar, cancelar;

	public Seletor() {
		super("Seletor de cores");
		setSize(160, 130);
    setResizable(false);
    setLayout(new FlowLayout());

    String[] opcoes = {"RED", "GREEN", "BLUE"};
    combo = new JComboBox(opcoes);
    backgroung = new JCheckBox("Background");
    foreground = new JCheckBox("Foreground");
    continuar = new JButton("Ok");
    cancelar = new JButton("Cancel");

    add(combo);
    add(backgroung);
    add(foreground);
    add(continuar);
    add(cancelar);
	}
	
	public static void main(String[] args) {
		Seletor seletor = new Seletor();
		seletor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		seletor.setVisible(true);
	}
}
