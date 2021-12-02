import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class example extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	
	public void init()
	{
		l1=new Label("First Number");
		l2=new Label("Second Number");
		l3=new Label("Result");
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		
		b1=new Button("Addition");
		b2=new Button("Substraction");
		b3=new Button("Multiplication");
		b4=new Button("Division");
		
		setLayout(null);
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		l3.setBounds(100,200,100,30);
		
		t1.setBounds(230,100,100,30);
		t2.setBounds(230,150,100,30);
		t3.setBounds(230,200,100,30);
		
		b1.setBounds(100,250,90,30);
		b2.setBounds(200,250,90,30);
		b3.setBounds(300,250,90,30);
		b4.setBounds(400,250,90,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		add(l1);
		add(l2);
		add(l3);
		
		add(t1);
		add(t2);
		add(t3);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String a,b;
			int c,i,j;
			a=t1.getText();
			b=t2.getText();
			i=Integer.parseInt(a);
			j=Integer.parseInt(b);
			c=i+j;
			t3.setText(""+c);
		}
		if(ae.getSource()==b2)
		{
			String a,b;
			int c,i,j;
			a=t1.getText();
			b=t2.getText();
			i=Integer.parseInt(a);
			j=Integer.parseInt(b);
			c=i-j;
			t3.setText(""+c);
		}
		if(ae.getSource()==b3)
		{
			String a,b;
			int c,i,j;
			a=t1.getText();
			b=t2.getText();
			i=Integer.parseInt(a);
			j=Integer.parseInt(b);
			c=i*j;
			t3.setText(""+c);
		}
		if(ae.getSource()==b4)
		{
			String a,b;
			int c,i,j;
			a=t1.getText();
			b=t2.getText();
			i=Integer.parseInt(a);
			j=Integer.parseInt(b);
			c=i/j;
			t3.setText(""+c);
		}
	}
}
/*<APPLET code="example.class" width=500 height=500></APPLET>*/