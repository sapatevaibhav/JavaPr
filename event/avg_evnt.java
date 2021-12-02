import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class avg_evnt extends Applet implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1;
	public void init()
	{
		l1=new Label("First Number : ");
		l2=new Label("Second Number : ");
		l3=new Label("Third Number : ");
		l4=new Label("Result : ");
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		
		b1=new Button("Find Average");
		
		setLayout(null);
		l1.setBounds(100,100,200,30);
		l2.setBounds(100,150,200,30);
		l3.setBounds(100,200,200,30);
		l4.setBounds(100,250,200,30);
		
		t1.setBounds(350,100,200,30);
		t2.setBounds(350,150,200,30);
		t3.setBounds(350,200,200,30);
		t4.setBounds(350,250,200,30);
		
		t4.setEditable(false);
		b1.setBounds(100,300,100,30);
		b1.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		
		add(b1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c;
		double avg;
		
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=Integer.parseInt(t3.getText());
		
		if(ae.getSource()==b1)
		{
			avg=(a+b+c)/3.0;
			t4.setText(""+avg);
		}
	}
}
/*<APPLET code="avg_evnt.class" width=700 height=700></APPLET>*/