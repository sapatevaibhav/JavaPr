import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class hwchoice extends Applet implements ActionListener
{
	Choice c1;
	Label l1;
	Button b1;
	
	public void init()
	{
		c1=new Choice();
		b1=new Button("OK");
		l1=new Label();
		
		c1.add("C");
		c1.add("C++");
		c1.add("JAVA");
		c1.add("PHP");
		c1.add("PYTHON");
		
		setLayout(null);
		c1.setBounds(100,100,150,30);
		b1.setBounds(120,150,50,30);
		l1.setBounds(100,200,500,30);
		
		b1.addActionListener(this);
		add(c1);
		add(b1);
		add(l1);
	}
	
	public void actionPerformed(ActionEvent ie)
	{
		if(ie.getSource()==b1)
		{
			l1.setText("Selected Item is :"+ c1.getSelectedItem());
		}
	}
}
/*<APPLET code="hwchoice.class" width=500 height=500></APPLET>*/