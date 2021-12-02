import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class lsteg2 extends Applet implements ActionListener
{
	List l1;
	public void init()
	{
		l1=new List(4,true);
		l1.add("C");
		l1.add("C++");
		l1.add("JAVA");
		l1.add("PYTHON");
		l1.add("PHP");
		l1.add("Android");
		
		l1.addActionListener(this);
		add(l1);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		int i,y=100;
		String str[]=l1.getSelectedItems();
		
		for(i=0;i<str.length;i++)
		{
			g.drawString("Selected Item="+str[i],200,y);
			y=y+30;
		}
	}
}
/*<APPLET code="lsteg.class" width=500 height=500></APPLET>*/