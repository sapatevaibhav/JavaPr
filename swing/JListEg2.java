import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import java.util.*;

public class JListEg2 extends JApplet implements ActionListener {
	JList l;
	Container c;
	JButton b1;
	JLabel l1;

	public void init() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		b1 = new JButton("ok");
		l1 = new JLabel("");

		Vector lm = new Vector();
		lm.add("red");
		lm.add("green");
		lm.add("blue");
		lm.add("black");
		lm.add("white");
		/*
		  DefaultListModel lm=new DefaultListModel();
		  lm.addElement("red");
		  lm.addElement("green"); 
		  lm.addElement("blue"); 
		  lm.addElement("white");
		  lm.addElement("black");
		 */
		l = new JList(lm);
		b1.addActionListener(this);

		c.add(l);
		c.add(b1);
		c.add(l1);
	}

	public void actionPerformed(ActionEvent e) {
		String str = (String) l.getSelectedValue();

		l1.setText("Selected color:" + str);
		// c.setBackgroundColor(Color.str);
	}
}
// <applet code="JListEg2" height=500 width=500></applet>
