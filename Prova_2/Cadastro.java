import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.File;
import java.io.IOException;

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

    ArrayList <Dados> dados = new ArrayList<Dados>();

	int indice = 0;


	public Cadastro(String titulo){



		super(titulo);
		separa();
		setLayout(new FlowLayout(FlowLayout.RIGHT));

		//Inicializa componentes da janela.
		jLabelNumero = new JLabel("Número" );
		jLabelNome = new JLabel("Nome" );
		jLabelGrupo = new JLabel("Grupo");

		jtextNumero = new JTextField(dados.get(indice).numero + "",10);
		jtextNome = new JTextField(dados.get(indice).nome,10);
		jtextGrupo = new JTextField(dados.get(indice).grupo + "",10);

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
	public void separa(){
        try{
		Scanner in = new Scanner(new File("dados.csv"));

        in.nextLine();
            while (in.hasNext()){
			    String[] line = in.nextLine().split(",");
                String nome = line[1];
                String numero = line[0];
                String grupo = line[2];
		        dados.add(new Dados(nome, Integer.parseInt(numero), Integer.parseInt(grupo)));
            }
        }catch(IOException e){
            System.out.print(e);
        }
    }

    public void atualiza(){
        jtextNumero.setText(dados.get(indice).numero + "");
        jtextNome.setText(dados.get(indice).nome + "");
        jtextGrupo.setText(dados.get(indice).grupo + "");
    }

	private class Escutador implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			if (event.getSource()==jbuttonAnterior) {
                indice--;
                if(indice < 0) {
                    indice = 25;
                }

			}else if (event.getSource()==jbuttonProximo) {
			    indice++;
                if(indice > 25){
                    indice = 0;
                }
            }
            atualiza();

		}

	}

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro("Cadastro");
		cadastro.pack();
		cadastro.setSize(210,150);
		cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadastro.setVisible(true);

	}

}
class Dados{
    int numero;
    int grupo;
    String nome;
	public Dados(String nome, int numero, int grupo){
		this.nome = nome;
		this.numero = numero;
		this.grupo = grupo;
	}

}





