import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class keyevent extends Applet implements KeyListener
{
	TextArea ta;
	Label l1;
	public void init()
	{
		ta=new TextArea();
		l1=new Label();
		
		setLayout(null);
		ta.setBounds(100,100,200,200);
		l1.setBounds(100,350,200,30);
		
		ta.addKeyListener(this);
		add(ta);
		add(l1);
	}
	public void keyPressed(KeyEvent ke)
	{
		l1.setText("Key is Pressed....");
	}
	public void keyReleased(KeyEvent ke)
	{
		l1.setText("Key is Released...");
	}
	public void keyTyped(KeyEvent ke)
	{
		l1.setText("Key is Typed...");
	}
} 
/*<APPLET code="keyevent.class" width=500 height=500></APPLET>*/