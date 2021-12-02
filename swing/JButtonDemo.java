import javax.swing.*;
import javax.swing.JButton;

public class JButtonDemo extends JApplet{
    public static void main(String args[]) {
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton();
        b.setText("Hi");
        b.setBounds(50,100,95,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
