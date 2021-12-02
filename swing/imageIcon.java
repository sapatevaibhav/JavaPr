import javax.swing.*;
import java.awt.*;

public class imageIcon extends JApplet {
    ImageIcon i;
    JLabel l1;
    Container c;

    public void init(){
        c=getContentPane();
        i=new ImageIcon("grunt.png");
        l1=new JLabel("Hello",i,JLabel.LEFT);
        c.add(l1);
    }
}

//<applet code="imageIcon" height=500 width=500></applet>
