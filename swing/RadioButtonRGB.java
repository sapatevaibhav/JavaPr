import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonRGB extends JApplet implements ItemListener {
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

        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);

        r.add(r1);
        r.add(r2);
        r.add(r3);
        c.add(r1);
        c.add(r2);
        c.add(r3);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == r1) {
            c.setBackground(Color.RED);
        }
        if (ie.getSource() == r2) {
            c.setBackground(Color.GREEN);
        }
        if (ie.getSource() == r3) {
            c.setBackground(Color.BLUE);
        }
    }
}
// ~<applet code="RadioButtonRGB" height=500 width=500></applet>