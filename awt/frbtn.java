import java.awt.*;
public class frbtn
{
	public static void main(String []args)
	{
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		
		Button b1,b2,b3;
		b1=new Button();
		b2=new Button("Hii");
		b3=new Button("Welcome");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
	}
}
