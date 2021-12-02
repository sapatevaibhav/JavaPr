import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonRGB2 extends JApplet implements ActionListener {
    JRadioButton r1, r2, r3;
    ButtonGroup r;
    Container c;

    public void init() {
        c = getContentPane();
        c.setLayout(new FlowLayout());

        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Green");
        r3 = new JRadioButton("Blue");
        r = new ButtonGroup();

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        r.add(r1);
        r.add(r2);
        r.add(r3);
        c.add(r1);
        c.add(r2);
        c.add(r3);
    }

    public void actionPerformed(ActionEvent ie) {
        if (ie.getSource() == r1) {
            JOptionPane.showMessageDialog(this, "Red color selected");
            c.setBackground(Color.RED);
        }
        if (ie.getSource() == r2) {
            JOptionPane.showMessageDialog(this, "Green color selected");
            c.setBackground(Color.GREEN);
        }
        if (ie.getSource() == r3) {
            JOptionPane.showMessageDialog(this, "Blue color selected");
            c.setBackground(Color.BLUE);
        }
    }
}
// ~<applet code="RadioButtonRGB2" height=500 width=500></applet>