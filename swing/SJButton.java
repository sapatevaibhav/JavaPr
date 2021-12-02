import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;

public class SJButton extends JApplet {
    Container c;
    ImageIcon i;
    JButton b1;

    public void init() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        i = new ImageIcon("java-jdk.png");
        b1 = new JButton("welcome", i);
        c.add(b1);
    }
}
// <applet code="SJButton" height=500 width=500></applet>