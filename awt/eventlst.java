import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class eventlst extends Applet implements ActionListener
{
	List l1;
	Button b1;
	public void init()
	{
		l1=new List(4,true);
		b1=new Button("OK");
		
		l1.add("C");
		l1.add("C++");
		l1.add("JAVA");
		l1.add("PYTHON");
		l1.add("PHP");
		l1.add("Andriod");
		
		b1.addActionListener(this);
		add(l1);
		add(b1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		
		int i=0,x=250;
		String str[]=l1.getSelectedItems();
		int ind[]=l1.getSelectedIndexes();
		
		g.drawString("This Selected Items Are : ",100,100);
		g.drawString("This Selected Indexs Are :",100,200);
		for(i=0;i<str.length;i++)
		{
		g.drawString(""+str[i] ,x+10,100);
		g.drawString(""+ind[i],x+10,200);
		x=x+70;
		}
	}
}
/*<APPLET code="eventlst.class" width=500 height=500></APPLET>*/