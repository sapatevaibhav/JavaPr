import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class JListCopy extends JApplet implements ActionListener{
	Container c;
	JList jl1,jl2;
	JButton b1;
	DefaultListModel lm1,lm2;
	
	public void init(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		b1=new JButton("Copy");
		lm1=new DefaultListModel();
		lm1.addElement("C");
		lm1.addElement("C++");
		lm1.addElement("Java");
		lm1.addElement("Python");
		lm2=new DefaultListModel();
		
		jl1=new JList(lm1);
		jl2=new JList(lm2);
		
		b1.addActionListener(this);
		c.add(jl1);
		c.add(b1);
		c.add(jl2);
	}
	
	public void actionPerformed(ActionEvent ae){
		jl2.setListData(jl1.getSelectedValues());
	}
}
//<applet code="JListCopy" height=500 width=500></applet>