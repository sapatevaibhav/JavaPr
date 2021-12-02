import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class click_big extends Applet implements MouseListener
{
	Font f;
	int i=10;
	public void init()
	{
		addMouseListener(this);
	}
	
	public void mousePressed(MouseEvent me)
	{}
	public void mouseReleased(MouseEvent me)
	{}
	public void mouseEntered(MouseEvent me)
	{}
	public void mouseExited(MouseEvent me)
	{}
	public void mouseClicked(MouseEvent me)
	{
		i=i+2;
		f=new Font("Times new roman",Font.BOLD,i);
		setFont(f);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("I want to be Devloper",100,100);
	}
}
/*<APPLET code="click_big.class" width=500 height=500 ></APPLET>*/