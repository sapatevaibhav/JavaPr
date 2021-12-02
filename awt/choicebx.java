import java.awt.*;
import java.applet.*;
public class choicebx extends Applet
{
	Choice c1;
	public void init()
	{
		c1=new Choice();
		c1.add("C");
		c1.add("java");
		c1.add("Pyton");
		c1.add("PHP");
		
		add(c1);
	}
	public void paint(Graphics g)
	{
		int cnt=c1.getItemCount();
		g.drawString("No of Items are"+cnt,100,100);
	}
}
/*<APPLET code="choicebx.class" WIDTH=500 HEIGHT=500></APPLET>*/