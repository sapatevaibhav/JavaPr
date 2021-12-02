import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class card_eg extends Applet implements ActionListener
{
	int cnt=1;
	Label l1,l2,l3,l4;
	Button b1,b2,b3,b4;
	CardLayout c;
	Panel p;
	
	public void init()
	{
		c=new CardLayout(50,50);
		p=new Panel();
		p.setLayout(c);
		l1=new Label("Card 1");
		l2=new Label("Card 2");
		l3=new Label("Card 3");
		l4=new Label("Card 4");
		
		b1=new Button("First");
		b2=new Button("Last");
		b3=new Button("Previous");
		b4=new Button("Next");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		
		add(p);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			cnt=1;
			c.first(p);
		}
		if(ae.getSource()==b2)
		{
			cnt=4;
			c.last(p);
		}
		if(ae.getSource()==b3)
		{
			if(cnt>1)
			{
				cnt=cnt-1;
				c.previous(p);
			}
		}
		if(ae.getSource()==b4)
		{
			if(cnt<4)
			{
				cnt=cnt+1;
				c.next(p);
			}
		}
	}
}
/*<APPLET code="card_eg.class" width=500 height=500></APPLET>*/