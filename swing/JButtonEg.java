import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class JButtonEg extends JApplet implements ActionListener {
    Container c;
    JButton b1, b2, b3;

    public void init() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b1 = new JButton("RED");
        b2 = new JButton("GREEN");
        b3 = new JButton("BLUE");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        b1.setMnemonic(KeyEvent.VK_R);
        b2.setMnemonic(KeyEvent.VK_G);
        b3.setMnemonic(KeyEvent.VK_B);

        c.add(b1);
        c.add(b2);
        c.add(b3);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            c.setBackground(Color.RED);
        }
        if (ae.getSource() == b2) {
            c.setBackground(Color.GREEN);
        }
        if (ae.getSource() == b3) {
            c.setBackground(Color.BLUE);
        }
    }
}
// <applet code="JButtonEg" height=500 width=500></applet>