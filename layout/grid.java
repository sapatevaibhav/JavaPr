import java.applet.*;
import java.awt.*;

public class grid extends Applet
{
	Button b1,b2,b3,b4,b5,b6;
	public void init()
	{
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
		
		setLayout(new GridLayout(2,4,30,30));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
}
/*<APPLET code="grid.class" width=500 height=500></APPLET>*/