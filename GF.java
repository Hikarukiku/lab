package lol;

import java.awt.*;
/**
 * Created by hikarukiku on 07.10.16.
 */
public class GF {
    private Color color1, color2, color3;
    private int x, y, a, b;

    public GF(){
        color1 = new Color(117, 162, 157);
        color2 = new Color(145, 97, 126);
        color3 = new Color(197, 255, 135);
        x = 25;
        y = 25;
        a = 25;
        b = 25;
    }

    public GF(Color color1, Color color2, Color color3, int x, int y, int a, int b ){
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public void draw(Graphics g){
        g.setColor(color1);
        g.fillRect(x,y,a,b);
        g.setColor(color2);
        g.drawRect(x,y,a,b);
        g.setColor(color3);
        g.fillRoundRect(x, y, a, b, a-10, b-10);
    }

}
