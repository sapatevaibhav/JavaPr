import java.awt.*;

public class frm
{
	public static void main(String []args)
	{
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		
		Button b1,b2,b3;
		b1=new Button();
		b2=new Button("Sign in ");
		b3=new Button("Hello");
		
		b1.setLabel("HI");
		
		f.setLayout(null);
		b1.setBounds(100,100,100,30);
		b2.setBounds(100,150,100,30);
		b3.setBounds(100,200,100,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
	}
}
