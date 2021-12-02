import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxEg2 extends JApplet implements ItemListener {
    Container c;
    JCheckBox c1, c2, c3;
    JTextField t;

    public void init() {
        c = getContentPane();
        c.setLayout(null);

        c1 = new JCheckBox("C");
        c2 = new JCheckBox("C++");
        c3 = new JCheckBox("Java");
        t = new JTextField();

        t.setEditable(false);

        c1.setBounds(100, 100, 100, 30);
        c2.setBounds(100, 150, 100, 30);
        c3.setBounds(100, 200, 100, 30);
        t.setBounds(250, 100, 200, 30);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(t);

    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == c1) {
            t.setText("C checkbox:" + (c1.isSelected() ? "Checked" : "Unchecked"));
        }
        if (ie.getSource() == c2) {
            t.setText("C++ checkbox:" + (c2.isSelected() ? "Checked" : "Unchecked"));
        }
        if (ie.getSource() == c3) {
            t.setText("Java checkbox:" + (c3.isSelected() ? "Checked" : "Unchecked"));
        }
    }
}
// <applet code="JCheckBoxEg2.class" height=500 width=500></applet>