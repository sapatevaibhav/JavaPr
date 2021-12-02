import java.applet.*;
import java.awt.*;

public class border extends Applet
{
	Button b1,b2,b3,b4,b5,b6;
	public void init()
	{
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b5=new Button("Six");
		
		setLayout(new BorderLayout(30,30));
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.CENTER);
	}
}
/*<APPLET code="border.class" width=500 height=500></APPLET>*/