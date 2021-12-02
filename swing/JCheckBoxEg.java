import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxEg extends JApplet implements ItemListener {
    Container c;
    JCheckBox c1, c2, c3;
    JLabel l1, l2, l3;

    public void init() {
        c = getContentPane();
        c.setLayout(null);

        c1 = new JCheckBox("C");
        c2 = new JCheckBox("C++");
        c3 = new JCheckBox("Java");
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();

        c1.setBounds(100, 100, 100, 30);
        c2.setBounds(100, 150, 100, 30);
        c3.setBounds(100, 200, 100, 30);
        l1.setBounds(250, 100, 200, 30);
        l2.setBounds(250, 150, 200, 30);
        l3.setBounds(250, 200, 200, 30);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(l1);
        c.add(l2);
        c.add(l3);

    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == c1) {
            l1.setText("C checkbox:" + (c1.isSelected() ? "Checked" : "Unchecked"));
        }
        if (ie.getSource() == c2) {
            l2.setText("C++ checkbox:" + (c2.isSelected() ? "Checked" : "Unchecked"));
        }
        if (ie.getSource() == c3) {
            l3.setText("Java checkbox:" + (c3.isSelected() ? "Checked" : "Unchecked"));
        }
    }
}
//<applet code="JCheckBoxEg.class" height=500 width=500></applet>