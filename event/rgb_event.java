import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class rgb_event extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1;
	
	public void init()
	{
		l1=new Label("Red Configuration");
		l2=new Label("Blue Configuration");
		l3=new Label("Green Configuration");
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		
		b1=new Button("Set Background");
		setLayout(null);
		l1.setBounds(100,100,150,30);
		l2.setBounds(100,150,150,30);
		l3.setBounds(100,200,150,30);
		
		t1.setBounds(300,100,150,30);
		t2.setBounds(300,150,150,30);
		t3.setBounds(300,200,150,30);
		
		b1.setBounds(100,250,150,30);
		
		b1.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		
		add(t1);
		add(t2);
		add(t3);
		
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
		int x=Integer.parseInt(t1.getText());
		int y=Integer.parseInt(t2.getText());
		int z=Integer.parseInt(t3.getText());
		
		setBackground( new Color(x,y,z) );
	}
}
/*<APPLET code="rgb_event.class" width=500 height=500></APPLET>*/