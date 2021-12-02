import java.awt.*;
import javax.swing.*;
import java.util.*;

public class JComboBoxEg extends JApplet {
    Container c;
    JComboBox c1,c2,c3;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        c1=new JComboBox();
        c1.addItem("C");
        c1.addItem("C++");
        c1.addItem("Java");
        c1.addItem("Python");

        String s[]={"RED","GREEN","BLUE"};
        c2=new JComboBox(s);

        Vector v=new Vector();
        v.add("Latur");
        v.add("Beed");
        v.add("Sambhajinagar");
        v.add("Osmanabad");
        c3=new JComboBox(v);

        c.add(c1);
        c.add(c2);
        c.add(c3);
    }
}

//~<applet code="JComboBoxEg" height=500 width=500></applet>