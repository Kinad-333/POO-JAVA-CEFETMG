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
    
    JButton jbuttonInserir;
    JButton jbuttonLimpar;

    ArrayList <Libraryitem> items = new ArrayList<Libraryitem>();;

    int indece = 0;

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
        
        jbuttonInserir = new JButton("Inserir");
		jbuttonInserir.setPreferredSize(new Dimension(180,18));
		
        //jbuttonLimpar = new JButton("Limpar");
		//jbuttonLimpar.setPreferredSize(new Dimension(180,18));


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

        //this.add(jbuttonLimpar);
        this.add(jbuttonInserir);

        Escutador handler = new Escutador();

		//Adiciona o escutador a cada botão.
		jbuttonInserir.addActionListener(handler);
        //jbuttonLimpar.addActionListener(handler);

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
        
    }

        private class Escutador implements ActionListener {
            

            @Override
            public void actionPerformed(ActionEvent event) {
                indece ++;			
                if (event.getSource()==jbuttonInserir) {
                    String title = jtextTitle.getText();
                    String medium = jtextMedium.getText();

                    String director = jtextDirector.getText();
                    String date = jtextDate.getText();
                    String distributor = jtextDistributor.getText();


                    String version = jtextVersion.getText();
                    String platform = jtextPlatform.getText();

                    if(version.equals(null)){
                        items.add(new Film(title, medium, director, date, distributor));
                    }
                    else if(director.equals(null)){
                        items.add(new Computer_program(title, medium, version, platform));
                    }
                    else{
                        items.add(new Recordeditem(title, medium));
                    }

                    atualiza();
                    System.out.println(items.get(indece));

                }
            
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



