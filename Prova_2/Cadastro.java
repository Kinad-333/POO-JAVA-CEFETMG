import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/***
 * Classe com escutador externo
 */
public class Cadastro extends JFrame  {


	//Define componentes da janela.
	private JLabel jLabelNumero;
	private JLabel jLabelNome;
	private JLabel jLabelGrupo;

	protected JTextField jtextNumero;
	protected JTextField jtextNome;
	protected JTextField jtextGrupo;

	private JButton jbuttonAnterior;
	private JButton jbuttonProximo;

	ArrayList <String> nome = new ArrayList<String>();
	ArrayList <String> numero = new ArrayList<String>();
	ArrayList <String> grupo = new ArrayList<String>();
	Dados dados = new Dados(nome, numero, grupo);
	int indice = 0;


	public Cadastro(String titulo) throws FileNotFoundException{



		super(titulo);
		separa();
		setLayout(new FlowLayout(FlowLayout.RIGHT));

		//Inicializa componentes da janela.
		jLabelNumero = new JLabel("Número" );
		jLabelNome = new JLabel("Nome" );
		jLabelGrupo = new JLabel("Grupo");

		jtextNumero = new JTextField(dados.numero.get(indice),10);
		jtextNome = new JTextField(dados.nome.get(indice),10);
		jtextGrupo = new JTextField(dados.grupo.get(indice),10);

		jbuttonAnterior = new JButton("Anterior");
		jbuttonProximo= new JButton("Próximo");


		//Adiciona componentes na janela.
		this.add(jLabelNumero);
		this.add(jtextNumero);

		this.add(jLabelNome);
		this.add(jtextNome);

		this.add(jLabelGrupo);
		this.add(jtextGrupo);

		this.add(jbuttonAnterior);
		this.add(jbuttonProximo);

		//Cria o escutador
		Escutador handler = new Escutador();

		//Adiciona o escutador a cada botão.
		jbuttonAnterior.addActionListener(handler);

		jbuttonProximo.addActionListener(handler);


		//Logica de inicialização aqui.
		// ...



	}
	public void separa()  throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader("dados.csv"));

        in.nextLine();

        while (in.hasNext()){
			String[] line = in.nextLine().split(",");
			numero.add(line[0]);
			nome.add(line[1]);
			grupo.add(line[2]);
		}
	}

    public void atualiza(){
        jtextNumero.setText(dados.numero.get(indice));
        jtextNome.setText(dados.nome.get(indice));
        jtextGrupo.setText(dados.grupo.get(indice));
    }

	private class Escutador implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			//Ações ao pressionarem os botões.

			if (event.getSource()==jbuttonAnterior) {
                indice--;

			}else if (event.getSource()==jbuttonProximo) {
			    indice++;
            }
            if(indice < 0){
                indice = 26;
            }
            if(indice > 26){
                indice = 0;
            }
            atualiza();

		}

	}

	public static void main(String[] args) throws FileNotFoundException{
		Cadastro cadastro = new Cadastro("Cadastro");
		cadastro.pack();
		cadastro.setSize(210,150);
		cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadastro.setVisible(true);

	}

}
class Dados{
	ArrayList <String> nome = new ArrayList<String>();
	ArrayList <String> numero = new ArrayList<String>();
	ArrayList <String> grupo = new ArrayList<String>();
	public Dados(ArrayList <String> nome, ArrayList <String> numero, ArrayList <String> grupo){
		this.nome = nome;
		this.numero = numero;
		this.grupo = grupo;
	}

}





