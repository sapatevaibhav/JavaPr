import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class choicelst extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	Label l1;
	CheckboxGroup cbg;
	
	public void init()
	{
		cbg=new CheckboxGroup();
		c1=new Checkbox("C",cbg,false);
		c2=new Checkbox("JAVA",cbg,false);
		c3=new Checkbox("PYTHON",cbg,false);
		
		l1=new Label();
		
		setLayout(null);
		c1.setBounds(100,100,50,30);
		c2.setBounds(100,150,50,30);
		c3.setBounds(100,200,90,30);
		l1.setBounds(100,300,200,30);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		add(c1);
		add(c2);
		add(c3);
		add(l1);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			l1.setText("C checkbox is :"+(c1.getState()? "Checked":"Unchecked"));
		}
		
		if(ie.getSource()==c2)
		{
			l1.setText("JAVA checkbox is :"+(c2.getState()?"Checked":"Unchecked"));
		}
		
		if(ie.getSource()==c3)
		{
			l1.setText("PYTHON checkbox is :"+(c3.getState()?"Checked":"Unchecked"));
		}
	}
}
/*<APPLET code="choicelst.class" width=500 height=500></APPLET>*/