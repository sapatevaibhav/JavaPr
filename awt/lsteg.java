import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class lsteg extends Applet implements ActionListener
{
	List l1;
	Button b1;
	public void init()
	{
		b1=new Button("Show");
		l1=new List(4,true);
		
		l1.add("C");
		l1.add("C++");
		l1.add("JAVA");
		l1.add("PYTHON");
		l1.add("PHP");
		l1.add("Android");
		
		setLayout(null);
		l1.setBounds(100,100,100,50);
		b1.setBounds(100,180,50,30);
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
		int i,y=300;
		int ind[]=l1.getSelectedIndexes();
		String str[]=l1.getSelectedItems();
		
		for(i=0;i<str.length;i++)
		{
			g.drawString("Selected Item="+str[i],100,y);
			g.drawString("Selected Indexes="+ind[i],250,y);
			y=y+30;
		}
	}
}
/*<APPLET code="lsteg.class" width=500 height=500></APPLET>*/