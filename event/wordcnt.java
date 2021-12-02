import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class wordcnt extends Applet implements KeyListener
{
	TextArea ta;
	public void init()
	{
		ta=new TextArea();
		setLayout(null);
		
		ta.setBounds(100,100,200,200);
		ta.addKeyListener(this);
		add(ta);
	}
	public void keyPressed(KeyEvent ke)
	{
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		repaint();
	}
	
	public void keyTyped(KeyEvent ke)
	{}
	
	public void paint(Graphics g)
	{
		String text=ta.getText();			// getting Contents of TextArea in Text variable
		String words[]=text.split("\\s");	// this split method is used to seperate the words in the String
		
		g.drawString("Number of Characters are : "+text.length(),100,350);
		g.drawString("Number of Words are : "+words.length,100,400);
	}
} 
/*<APPLET code="wordcnt.class" width=500 height=500></APPLET>*/