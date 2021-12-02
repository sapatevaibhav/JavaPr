
import java.awt.*;
class trial 
{
	public static void main(String[] args)
	{
	
	
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(1000,1000);
		
		Label l1,l2,l3,l4;
		l1=new Label("One");
		l2=new Label("Two");
		l3=new Label("Three");
		l4=new Label("Four");
		
		f.setLayout(null);
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		l3.setBounds(100,200,100,30);
		l4.setBounds(100,250,100,30);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
	
	}
}
//<APPLET code="trial" width=1000 height=1000></APPLET>