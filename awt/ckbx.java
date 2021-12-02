import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ckbx extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	Label l1,l2,l3;
	
	public void init()
	{
		c1=new Checkbox("C");
		c2=new Checkbox("JAVA");
		c3=new Checkbox("PHP");
		
		l1=new Label();
		l2=new Label();
		l3=new Label();
		
		setLayout(null);
		c1.setBounds(100,100,50,30);
		c2.setBounds(100,150,50,30);
		c3.setBounds(100,200,50,30);
		
		l1.setBounds(200,100,200,30);
		l2.setBounds(200,150,200,30);
		l3.setBounds(200,200,200,30);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		add(c1);
		add(c2);
		add(c3);
		add(l1);
		add(l2);
		add(l3);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			l1.setText("C CheckBox is :"+ (c1.getState() ? "Checked":"Un-Checked"));
		}
		
		if(ie.getSource()==c2)
		{
			l2.setText("JAVA CheckBox is :"+ (c2.getState() ? "Checked":"Un-Checked"));
		}
		if(ie.getSource()==c3)
		{
			l3.setText("PHP CheckBox is :"+ (c3.getState() ? "Checked":"Un-Checked"));
		}
	}
} 
/*<APPLET code="ckbx.class" width=500 height=500></APPLET>*/