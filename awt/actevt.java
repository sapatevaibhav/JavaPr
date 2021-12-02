import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class actevt extends Applet implements ActionListener
{
	Button b1,b2;
	TextField t1;
	
	public void init()
	{
		b1=new Button("Click Me");
		b2=new Button("Good Morning");
		t1= new TextField();
		
		setLayout(null);
		b1.setBounds(100,100,100,30);
		b2.setBounds(250,100,100,30);
		t1.setBounds(100,150,200,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(b1);
		add(b2);
		add(t1);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t1.setText("Click Me");
		}
		
		if(ae.getSource()==b2)
		{
			t1.setText("Good Morning");
		}
	}
}
/*<APPLET code="actevt.class" width=500 height=500></APPLET>*/