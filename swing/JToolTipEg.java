import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class JToolTipEg extends JApplet implements ActionListener{
    Container c;
    JLabel l1;
    JPasswordField t1;
    JToggleButton b1;
    JButton b2;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        l1=new JLabel("Enter Password");
        t1=new JPasswordField(10);
        t1.setEchoChar('*');
        t1.setToolTipText("Password must contain 8 letters");

        b1=new JToggleButton("Show");
        b1.setToolTipText("Show the password");
        b1.addActionListener(this);

        b2=new JButton("clear");
        b2.setToolTipText("Clear the password");
        b2.addActionListener(this);

        c.add(l1);
        c.add(t1);
        c.add(b1);
        c.add(b2);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            if(b1.isSelected()){
                t1.setEchoChar((char)0);
                b1.setText("Hide");
                b1.setToolTipText("Hide the password");
            }
            else{
                t1.setEchoChar('*');
                b1.setText("Show");
                b1.setToolTipText("Show the password");
            }
        }
        else{
            t1.setText("");
        }
    }
}
//<applet code="JToolTipEg" height=500 width=500></applet>
