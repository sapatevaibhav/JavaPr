import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;

public class JTabbedPaneEg2 extends JApplet{
	
	Container c;
	JTabbedPane tb;
	JButton b1,b2,b3,b4;
	JCheckBox c1,c2,c3;
	JComboBox cb1;
	JPanel p1,p2,p3;
	
	public void init(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1=new JButton("C");
		JButton b2=new JButton("C++");
		JButton b3=new JButton("Java");
		JButton b4=new JButton("Python");
		JPanel p1=new JPanel();
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		JCheckBox c1=new JCheckBox("1st year");
		JCheckBox c2=new JCheckBox("2nd year");
		JCheckBox c3=new JCheckBox("3rd year");
		JPanel p2=new JPanel();
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		
		JComboBox cb1=new JComboBox();
		cb1.addItem("Beed");
		cb1.addItem("Latur");
		cb1.addItem("Sambhajinagar");
		JPanel p3=new JPanel();
		p3.add(cb1);
		
		tb=new JTabbedPane();
		tb.addTab("Languages",p1);
		tb.addTab("Year",p2);
		tb.addTab("District",p3);
		c.add(tb);
	}
}
//<applet code="JTabbedPaneEg2" height=500 width=500></applet>