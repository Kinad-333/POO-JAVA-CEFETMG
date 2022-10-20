import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, espaco, soma, subtração, multiplicação, divisão, resultado;
  private JTextField entrada;

	public Calculadora() {
		super("Calculadora");
		setSize(200, 150);
    setResizable(false);
    setLayout(new FlowLayout());

    entrada = new JTextField(16);
    b0 = new JButton("0");
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    espaco = new JButton(" ");
    soma = new JButton("+");
    sub = new JButton("-");
    mult = new JButton("*");
    div = new JButton("/");
    res = new JButton("=");

    add(entrada);
    add(b7); add(b8); add(b9); add(divisão);
    add(b4); add(b5); add(b6); add(multiplicação);
    add(b3); add(b2); add(b1); add(subtração);
    add(b0); add(espaco); add(soma); add(resultado);
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadora.setVisible(true);
	}
}
