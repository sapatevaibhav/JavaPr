import java.awt.*;
import javax.swing.*;
import javax.swing.JCheckBox;

public class Demo extends JApplet {
    Container c;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    ImageIcon i1,i2,i3,i4;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        i1=new ImageIcon("css.png");
        i2=new ImageIcon("html.png");
        i3=new ImageIcon("logo.png");
        i4=new ImageIcon("json.png");

        c1=new JCheckBox();
        c2=new JCheckBox("HSC");
        c3=new JCheckBox("POLY",true);
        c4=new JCheckBox(i1);
        c5=new JCheckBox(i2,false);
        c6=new JCheckBox("BE",i3);
        c7=new JCheckBox("ME",i4,true);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        c.add(c6);
        c.add(c7);

    }
}
//<applet code="Demo" height=500 width=500></applet>