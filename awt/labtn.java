import java.awt.*;
import java.applet.*;
public class labtn extends Applet 
{
	Label l1,l2,l3;
	Button b1,b2,b3;
	String l4;
	public void init()
	{
		l1=new Label();
		l2=new Label("Hellow....");
		l3=new Label("Hii 123");
		
		l1.setText("Good Morning");
		setLayout(null);
		
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		l3.setBounds(100,200,100,30);
		add(l1);
		add(l2);
		add(l3);
	}
	
	public void paint(Graphics g)
	{
		l4=l1.getText();
		g.drawString("L4="+l4,100,400);
	}
}
/*<APPLET code="labtn.class" width=500 height=500 ></APPLET>*/
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 