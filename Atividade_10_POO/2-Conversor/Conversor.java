import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Janela extends JFrame implements ActionListener {
    private JLabel labelCelsius, labelFarenheit;
    protected JTextField dados;
    private JButton butao;

    public Janela(String titulo) {
        super(titulo);
		setSize(250, 100);
        setLayout(new GridLayout(2, 2, 10, 10));

        input = new JTextField("0");
        labelCelsius = new JLabel("Celsius");
        button = new JButton("Convert");
        labelFarenheit = new JLabel("Farenheit");

        add(dados);
        add(labelCelsius);
        add(butao);
        add(labelFarenheit);

        button.addActionListener(this);
    }

    @Override
	public void actionPerformed(ActionEvent event) {
        double celsius = Double.parseDouble(input.getText());
        double farenheit = celsius * 1.8 + 32;
        labelFarenheit.setText(farenheit + " Farenheit");
    }
}

public class Conversor {
    public static void main(String args[]) {
        Janela janela = new Janela("Conversor de temperatura");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
