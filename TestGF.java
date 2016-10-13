package lol;
import javax.swing.*;
import java.awt.*;
/**
 * Created by hikarukiku on 07.10.16.
 */
public class TestGF {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GFPanel());

        frame.setPreferredSize(new Dimension(400, 400));
        frame.setLocation(300, 300);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.pack();
        frame.setVisible(true);
    }

}
