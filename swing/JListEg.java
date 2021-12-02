import java.awt.*;
import javax.swing.*;
import java.util.*;

public class JListEg extends JApplet {
    Container c;
    JList jl1, jl2, jl3, jl4;

    public void init() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        String str[] = { "C", "C++", "Java", "PHP" };
        Vector v = new Vector();

        v.addElement("SSC");
        v.addElement("HSC");
        v.addElement("POLYTECHNIC");
        v.addElement("BE");
        v.addElement("ME");
        DefaultListModel Im = new DefaultListModel();

        Im.addElement("RED");
        Im.addElement("GREEN");
        Im.addElement("BLUE");

        jl1 = new JList();
        jl2 = new JList(str);
        jl3 = new JList(v);
        jl4 = new JList(Im);

        c.add(jl1);
        c.add(jl2);
        c.add(jl3);
        c.add(jl4);
    }
}
/*
 * <applet code="JListEg.class" width=500 height=500></applet>
 */