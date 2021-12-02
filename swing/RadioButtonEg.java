import java.awt.*;
import javax.swing.*;

public class RadioButtonEg extends JApplet {
    Container c;
    ImageIcon i1,i2,i3,i4;
    JRadioButton r1,r2,r3,r4,r5,r6,r7;
    ButtonGroup br;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        i1=new ImageIcon("oraclelogo.gif");
        i2=new ImageIcon("css.png");
        i3=new ImageIcon("html.png");
        i4=new ImageIcon("logo.png");
        br=new ButtonGroup();

        r1=new JRadioButton();
        r2=new JRadioButton("C++");
        r3=new JRadioButton("Java",true);
        r4=new JRadioButton(i1);
        r5=new JRadioButton(i2,true);
        r6=new JRadioButton("HTML",i3);
        r7=new JRadioButton("php",i4,true);

        br.add(r1);
        br.add(r2);
        br.add(r3);
        br.add(r4);
        br.add(r5);
        br.add(r6);
        br.add(r7);

        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(r4);
        c.add(r5);
        c.add(r6);
        c.add(r7);
    }
}
//<applet code="RadioButtonEg" height=500 width=500></applet>