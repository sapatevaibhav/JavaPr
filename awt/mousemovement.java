//Error
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class mousemovement extends Applet implements MouseMotionListener
{
	String str;
	Label l1;
	public void init()
	{
		l1=new Label();
		l1.addMouseMotionListener(this);
		add(l1);
	}
	public void mouseMoved(MouseEvent me)
	{
		str="Mouse Moved";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		str="Mouse Dragged";
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(str,100,100);
	}
}
/*<APPLET code="mousemovement.class" width=500 height=500></APPLET>*/