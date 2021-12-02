import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;

public class JTextAreaEg extends JApplet implements ActionListener{
	Container c;
	JTextArea ta;
	JLabel l1,l2;
	JButton b1;
	
	public void init(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ta=new JTextArea(10,10);
		b1=new JButton("Done");
		l1=new JLabel();
		l2=new JLabel();
		
		b1.addActionListener(this);
		c.add(ta);
		c.add(b1);
		c.add(l1);
		c.add(l2);
	}
	
	public void actionPerformed(ActionEvent ae){
		String s=ta.getText();
		String words[]=s.split("\\s");
		
		l1.setText("Words are:"+words.length);
		l2.setText("Characters are:"+s.length());
	}
}

//<applet code="JTextAreaEg" height=500 width=500></applet>
		
		
		
		
		
		