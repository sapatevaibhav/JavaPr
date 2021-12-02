//error

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ariChoice extends Applet implements ItemListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Choice c1;
	public void init()
	{
		l1=new Label("First Number : ");
		l2=new Label("Second Number : ");
		l3=new Label("Result : ");
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		
		c1=new Choice();
		c1.add("Addition");
		c1.add("Substraction");
		c1.add("Multiplication");
		c1.add("Division");
		
		setLayout(null);
		l1.setBounds(100,100,150,30);
		l2.setBounds(100,150,150,30);
		l3.setBounds(100,200,150,30);
		
		t1.setBounds(300,100,150,30);
		t2.setBounds(300,150,150,30);
		t3.setBounds(300,200,150,30);
		
		c1.setBounds(100,250,150,30);
		
		c1.addItemListener(this);
		add(l1);
		add(l2);
		add(l3);
		
		add(t1);
		add(t2);
		add(t3);
		
		add(c1);
		
	}

	public void itemStateChanged(ItemListener ie)
	{
		String str=c1.getSelectedItem();
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=0;
		
			if(str.equals("Addition"))
			{
				c=a+b;
			}
			if(str.equals("Substraction"))
			{
				c=a-b;
			}
			if(str.equals("Multiplication"))
			{
				c=a*b;
			}
			if(str.equals("Division"))
			{
				c=a/b;
			}
			t3.setText(Integer.toString(c));
		
	}
}
/*<APPLET code="arithmtic_chice.class" height=500 width=500></APPLET>*/