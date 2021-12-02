import java.awt.*;
import java.applet.*;
public class btn extends Applet
{
	Button b1,b2,b3;
	public void init()
	{
		b1=new Button();
		b2=new Button("ok");
		b3=new Button("Hello");
		
		b1.setLabel("Sign In");
		
		add(b1);
		add(b2);
		add(b3);
	}
}
/*<APPLET code="btn" width=500 height=500></APPLET>*/