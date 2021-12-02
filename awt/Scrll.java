import java.awt.*;
import java.applet.*;

public class Scrll extends Applet
{
	Scrollbar s1,s2;
	public void init()
	{
		s1=new Scrollbar();
		s2=new Scrollbar(Scrollbar.HORIZONTAL,150,50,0,300);
		
		setLayout(null);
		s1.setBounds(100,100,20,100);
		s2.setBounds(150,100,200,30);
		
		add(s1);
		add(s2);
	}
}
/*<APPLET code="Scrll.class" width=500 height=500></APPLET>*/