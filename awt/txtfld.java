import java.awt.*;
import java.applet.*;
public class txtfld extends Applet
{
	TextField t1,t2;
	public void init()
	{
		t1=new TextField("Hello Everyone");
		t2=new TextField("Hello Whats Up");
		
		setLayout(null);
		t1.setBounds(100,100,100,30);
		t2.setBounds(100,150,100,30);
		
		add(t1);
		add(t2);
	}
}
/*
	<applet code="txtfld" width=500 height=500>
	</applet>
*/