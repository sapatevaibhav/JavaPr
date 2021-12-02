import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class movecircle extends Applet implements MouseMotionListener
{
	int x,y;
	String str;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent me)
	{
		str="Circle Moved";
		x=me.getX();
		y=me.getY();
		repaint();
	}
	
	public void mouseDragged(MouseEvent me)
	{
		str="Circle Dragged";
		x=me.getX();
		y=me.getY();
		repaint();
		
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,100);
		g.drawOval(x-50,y-50,100,100);
	}
	
} 
/*<APPLET code="movecircle.class" width=500 height=500></APPLET>*/