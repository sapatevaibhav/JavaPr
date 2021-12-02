import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class card extends Applet implements ActionListener
{
	CardLayout c;
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		c=new CardLayout(30,30);
		b1=new Button("ONE");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		
		setLayout(c);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
	public void actionPerformed(ActionEvent ae)
	{
		c.next(this);
	}
}
/*<APPLET code="card.class" width=500 height=500></APPLET>*/