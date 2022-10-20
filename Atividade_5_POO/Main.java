        import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {

	JLabel jLabelTitle;
    JLabel jLabelMedium;

    JLabel jLabelDirector;
    JLabel jLabelDate;
    JLabel jLabelDistributor;

    JLabel jLabelVersion;
    JLabel jLabelPlatform;
    

    JTextField jtextTitle;
	JTextField jtextMedium;

    JTextField jtextDirector;
    JTextField jtextDate;
    JTextField jtextDistributor;

    JTextField jtextVersion;
    JTextField jtextPlatform;
    
    JButton jbuttonFilme;
    JButton jbuttonPrograma;

    ArrayList <Libraryitem> items = new ArrayList<Libraryitem>();


    int indice = 0;
    public void itemInfo(Libraryitem item){
        System.out.println(item.toString());
    }

    public Main() {
        ArrayList <Libraryitem> items_para_metodo_itemsInfo = new ArrayList<Libraryitem>();
    
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        jLabelTitle = new JLabel("Titulo");
        jLabelMedium = new JLabel("Medium");

        jLabelDirector = new JLabel("Director");
        jLabelDate = new JLabel("Date");
        jLabelDistributor = new JLabel("Distributor");

        jLabelVersion = new JLabel("Version");
        jLabelPlatform = new JLabel("Platform");



        jtextTitle = new JTextField("",10);
        jtextMedium = new JTextField("",10);

        jtextDirector = new JTextField("",10);
        jtextDate= new JTextField("",10);
        jtextDistributor = new JTextField("",10);

        jtextVersion = new JTextField("",10);
        jtextPlatform = new JTextField("",10);
        
        jbuttonFilme = new JButton("Filme");
		jbuttonFilme.setPreferredSize(new Dimension(180,18));
		
        jbuttonPrograma = new JButton("Programa");
		jbuttonPrograma.setPreferredSize(new Dimension(180,18));


        this.add(jLabelTitle);
        this.add(jtextTitle);
        
        this.add(jLabelMedium);
        this.add(jtextMedium);

        this.add(jLabelDirector);
        this.add(jtextDirector);

        this.add(jLabelDate);
        this.add(jtextDate);

        this.add(jLabelDistributor);
        this.add(jtextDistributor);

        this.add(jLabelVersion);
        this.add(jtextPlatform);

        this.add(jbuttonFilme);
        this.add(jbuttonPrograma);

        Escutador handler = new Escutador();

		//Adiciona o escutador a cada botão.
		jbuttonFilme.addActionListener(handler);
        jbuttonPrograma.addActionListener(handler);

        items_para_metodo_itemsInfo.add(new Publisheditem("Carros 2", "Disney"));
        items_para_metodo_itemsInfo.add(new Recordeditem("Meu_primeiro video", "YouTube"));
        items_para_metodo_itemsInfo.add(new Film("Django Livre","93%", "Tarantiono","18/01/2013","HBO max"));
        items_para_metodo_itemsInfo.add(new Computer_program("Flappy Bird","5 estrelas", "1.3","IOS/Android"));
         

        for(int i=0; i< items_para_metodo_itemsInfo.size(); i++){
            itemInfo(items_para_metodo_itemsInfo.get(i));
        }
        
    }
    public void atualiza(){
        jtextTitle.setText(null);
        jtextMedium.setText(null);

        jtextDirector.setText(null);
        jtextDate.setText(null);
        jtextDistributor.setText(null);

        jtextVersion.setText(null);
        jtextPlatform.setText(null);
        
        indice++; 
    }

        private class Escutador implements ActionListener {
            String title;
            String medium; 

            String director;
            String date;
            String distributor; 


            String version;
            String platform;

            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource()==jbuttonFilme) {
                    title = jtextTitle.getText();
                    medium = jtextMedium.getText();

                    director = jtextDirector.getText();
                    date = jtextDate.getText();
                    distributor = jtextDistributor.getText();

                    items.add(new Film(title, medium, director, date, distributor));
                }
                else if(event.getSource()==jbuttonPrograma){
                    title = jtextTitle.getText();
                    medium = jtextMedium.getText();
                    
                    version = jtextVersion.getText();
                    platform = jtextPlatform.getText();
                    
                    items.add(new Computer_program(title, medium, version, platform));
                }
            System.out.println(items.get(indice));
            atualiza();
	    }
    }
    public static void main(String[] args){
        Main main = new Main();
        main.pack();
        main.setSize(400,350);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }

}



