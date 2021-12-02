import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class JListEg3 extends JApplet implements ActionListener{
	Container c;
	JList jl1;
	JButton b1,b2,b3;
	JTextField t1;
	DefaultListModel m1;
	
	public void init(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		t1=new JTextField(10);
		b1=new JButton("Add");
		b2=new JButton("Remove");
		b3=new JButton("Clear");
		
		m1=new DefaultListModel();
		m1.addElement("C");
		m1.addElement("C++");
		m1.addElement("Java");
		
		jl1=new JList(m1);
		
		c.add(jl1);
		c.add(t1);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		String str=t1.getText();
		
		if(ae.getSource()==b1){
			m1.addElement(str);
		}
		if(ae.getSource()==b2){
			int i=jl1.getSelectedIndex();
			m1.remove(i);
		}
		if(ae.getSource()==b3){
			m1.removeAllElements();
		}
	}
}
//<applet code="JListEg3" height=500 width=500></applet>





