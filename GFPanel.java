package lol;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GFPanel extends JPanel {
    private GF  gf[] = new GF[5];
    int x=0, y=0, a = 50, b = 50;
    Random randgen = new Random();
    public GFPanel(){
        for (int i = 0; i<5; i++) {
            int c1 = randgen.nextInt(256);
            int c2 = randgen.nextInt(256);
            int c3 = randgen.nextInt(256);

            int c4 = randgen.nextInt(256);
            int c5 = randgen.nextInt(256);
            int c6 = randgen.nextInt(256);

            int c7 = randgen.nextInt(256);
            int c8 = randgen.nextInt(256);
            int c9 = randgen.nextInt(256);
            gf[i] = new GF(new Color(c1, c2, c3), new Color(c4, c5, c6), new Color(c7, c8, c9), x, y, a, b);
            x+=50;
            y+=50;
            a+=5;
            b+=5;
        }
       setPreferredSize(new Dimension(300, 200));
        setBackground(new Color(1, 1, 1));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i<5; i++){
            gf[i].draw(g);
        }
    }
}
