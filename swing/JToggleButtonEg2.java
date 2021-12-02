import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JToggleButtonEg2 extends JApplet implements ItemListener{
    JToggleButton tb;
    ImageIcon i;
    Container c;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        tb=new JToggleButton("Start",i);

        tb.addItemListener(this);
        c.add(tb);
    }

    public void itemStateChanged(ItemEvent ie){
        if(tb.isSelected()){
            tb.setText("Stop");
            i=new ImageIcon("loading.gif");
            tb.setIcon(i);
        }else{
        tb.setText("Start");
        i=new ImageIcon("loading2.gif");
         tb.setIcon(i);
        }
    }
}

//<applet code="JToggleButtonEg2" height=500 width=500></applet>
