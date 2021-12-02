import java.awt.*;
import java.applet.*;
public class form1 extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2;
	TextArea ta;
	Button b1;
	
	public void init()
	{
		l1=new Label("UserName");
		l2=new Label("Password");
		l3=new Label("Adress");
		t1=new TextField(20);
		t2=new TextField(20);
		ta=new TextArea("Hello",15,15,4);
		b1=new Button("Login");
		
		setLayout(null);
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		l3.setBounds(100,200,100,30);
		t1.setBounds(230,100,100,30);
		t2.setBounds(230,150,100,30);
		ta.setBounds(230,200,250,150);
		b1.setBounds(100,400,100,50);
		
		t2.setEchoChar('*');
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(b1);
		add(ta);
	}
}
	

/*<APPLET code="form1.class" width=1000 height=1000></APPLET>*/