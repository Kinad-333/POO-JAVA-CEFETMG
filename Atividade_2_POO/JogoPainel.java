// Bibliotecas necessarias para criar uma janela
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.naming.InitialContext;
import javax.swing.JPanel;
//Parte interna da janela
public class JogoPainel extends JPanel implements Runnable{
    //Variveis da class para controle dos metodos
    private Thread animacao;
    private int tempoEspera = 10;
    private boolean jogando = false;
    //Definição de array do objeto
    ArrayList <Movel> bolas = new ArrayList <Movel>();

    Color Color = new Color(23, 25, 23);
    // Cria um construtor da classe
    public JogoPainel() {
        //Define a cor da tela
        setBackground(Color);
        setFocusable(true);
    }
    public void addNotify(){
        super.addNotify();
        iniciarJogo();
    }
    //começa o jogo
    public void iniciarJogo(){
        criaArray();
        if (animacao == null || !jogando){
            animacao = new Thread(this);
            animacao.start();
        }
    }
    //cria o tamanho da array
    public void criaArray(){
        for(int i = 0; i<= 10;i++){
            bolas.add(new Movel());
        }
    }
    public void run(){
        boolean ver = false;
        jogando = true;
        while(jogando){
            //verifica a posição da array e usa o metodo
            for(int i = 0; i<= 10;i++){
                bolas.get(i).move();
                //ver = colide();
                //if(ver == true){
                //    bolas.get(i).move();
                //}
            }
            repaint();
            try{
                Thread.sleep(tempoEspera);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.exit(0);
    }
    public void paintComponent(Graphics g){
        //Pinta a tela de preta
        super.paintComponent(g);
        //verifica a posição da array e usa o metodo
        for(int i = 0; i<= 10;i++){
            bolas.get(i).paintComponent(g);
        }
    }
    /*public boolean colide(){
        double dist = 0;
        for(int i = 0; i<= 10; i++){
            dist = Math.sqrt(((bolas.get(i).x - bolas.get(i+1).x)^2)+((bolas.get(i).y - bolas.get(i+1).y)^2));
        }
        for(int i = 0; i<= 10; i++){
            if(dist < bolas.get(i).dimension.height){
                return true;
            }
        return false;
    }
    return false;
}*/

    /**
     *     Usado para controlar  as bolinhas no caso como e para elas ficarem aleatoriamente não esta sendo usado
     *
     */
    /*@Override
    public void keyPressed(KeyEvent tecla){
        switch(tecla.getKeyCode()){
            case KeyEvent.VK_UP:
                System.out.println("Precionado cima");
                velocidadeY = -1;
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("Precionado baixo");
                velocidadeY = 1;
                y += velocidadeY;
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("Precionado esquerda");
                velocidadeX = -1;
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("Precionado direita");
                velocidadeX = 1;
                break;
        }
        x += velocidadeX;
        y += velocidadeY;
    }
    @Override
    public void keyReleased(KeyEvent tecla){
        switch(tecla.getKeyCode()){
            case KeyEvent.VK_UP:
                System.out.println("Solto cima");
                y = 0;
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("Solto baixo");
                y = 0;
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("Solto esquerda");
                x = 0;
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("Solto direita");
                x = 0;
                break;
        }
    }
    @Override
    public void keyTyped(KeyEvent tecla){
    }*/
}
