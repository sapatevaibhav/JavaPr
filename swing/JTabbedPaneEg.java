import java.awt.*;
import javax.swing.*;
import java.util.*;

public class JTabbedPaneEg extends JApplet{
	Container c;
	JTabbedPane tb;
	JComboBox cb;
	JCheckBox c1,c2,c3,c4;
	JList l;
	JPanel p1,p2,p3;

	public void init(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		tb=new JTabbedPane();

		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();

		cb=new JComboBox();
		cb.addItem("Font");
		cb.addItem("FontStyle");
		cb.addItem("FontSize");

		c1=new JCheckBox("SubScript");
		c2=new JCheckBox("SuperScript");
		c3=new JCheckBox("Strike");
		c4=new JCheckBox("Shadow");


		Vector v=new Vector();
		v.addElement("Bold");
		v.addElement("Italic");
		v.addElement("Underline");
		l=new JList(v);

		p1.add(cb);
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		p3.add(l);

		tb.addTab("ComboBox",p1);
		tb.addTab("CheckBox",p2);
		tb.addTab("List",p3);
		c.add(tb);
	}
}
//<applet code="JTabbedPaneEg" height=500 width=500></applet>

