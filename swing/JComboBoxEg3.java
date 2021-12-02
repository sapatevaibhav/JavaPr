import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JComboBoxEg3 extends JApplet implements ItemListener {
    Container c;
    JComboBox c1;
    Label l1;

    public void init() {
        c = getContentPane();
        c.setLayout(new FlowLayout());

        c1 = new JComboBox();
        c1.addItem("Java");
        c1.addItem("Python");
        c1.addItem("JavaScript");
        l1 = new Label();

        c1.addItemListener(this);
        c.add(c1);
        c.add(l1);

    }

    public void itemStateChanged(ItemEvent ie) {
        int i = (c1.getSelectedIndex());
        String s = c1.getItemAt(i).toString();
        l1.setText(s);
    }
}

// <applet code="JComboBoxEg3" height=500 width=500></applet>