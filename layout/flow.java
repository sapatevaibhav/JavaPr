import java.applet.*;
import java.awt.*;
public class flow extends Applet
{
	Button b1,b2,b3;
	public void init()
	{
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		
		setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));
		add(b1);
		add(b2);
		add(b3);
	}
}
/*<APPLET code="flow.class" width=500 height=500></APPLET>*/