import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;
public class Movel extends JPanel{
    //define o contrutor da classe
    public Movel(){}
    Dimension dimension;
    public int LARGURA = 610, ALTURA = 430;
    Random random = new Random();
    //Deixar as bolinhas mais randomicas possivel
    int diametroBola = random.nextInt(10,50);
    public int x = random.nextInt(200, 500), y = random.nextInt(200, 400),  velocidadeX = random.nextInt(1,4), velocidadeY = random.nextInt(1,4);
    //RGB
    float r = random.nextFloat();
    float g = random.nextFloat();
    float b = random.nextFloat();

    //Cor random
    Color randomColor = new Color(r, b, g);

    public void move(){
        if(x >= LARGURA - diametroBola){
            velocidadeX *= -1;
        }
        if(x <= 0){
            velocidadeX *= -1;
        }
        if(y >= ALTURA - diametroBola){
            velocidadeY *= -1;
        }
        if(y <= 0){
            velocidadeY *= -1;
        }
        x += velocidadeX;
        y += velocidadeY;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(randomColor);
        g.drawOval(x, y, diametroBola, diametroBola);
    }
}
