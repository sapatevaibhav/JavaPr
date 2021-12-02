 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;

 public class JToggleButtonEg extends JApplet implements ItemListener{
    JToggleButton tb;
    Container c;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        tb=new JToggleButton("Start");
        tb.addItemListener(this);
        c.add(tb);
    }

    public void itemStateChanged(ItemEvent ie){
        if(tb.isSelected()){
            tb.setText("Stop");
        }else{
            tb.setText("Start");
        }
    }
 }

 //<applet code="JToggleButtonEg" height=500 width=500></applet>
