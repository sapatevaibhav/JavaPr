import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;

public class JProgressBarEg3 extends JApplet implements Runnable,ActionListener{
    Container c;
    JProgressBar jp;
    Thread t;
    JButton b1,b2;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        jp=new JProgressBar();
        jp.setStringPainted(true);
        t=new Thread(this);
        b1=new JButton("Start");
        b2=new JButton("Stop");

        b1.addActionListener(this);
        b2.addActionListener(this);
        c.add(jp);
        c.add(b1);
        c.add(b2);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            t.start();
        }
        if(ae.getSource()==b2){
            t.stop();
        }
    }

    public void run(){

        try{
            for(int i=1;i<=100;){
                jp.setValue(i);
                jp.setForeground(Color.RED);
                i++;
                Thread.sleep(100);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//<applet code="JProgressBarEg3" height=500 width=500></applet>
