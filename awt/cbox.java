import java.awt.*;
import java.applet.*;
public class cbox extends Applet
{
	Checkbox c1,c2,c3,c4;
	CheckboxGroup cbg;
	public void init()
	{
		cbg=new CheckboxGroup();
		c1=new Checkbox();
		c2=new Checkbox("Hii",false,cbg);
		c3=new Checkbox("hello",cbg,true);
		c4=new Checkbox("Byee",cbg,true);
		
		c1.setLabel("Come On");
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}	
}
/*<APPLET CODE="cbox.class" WIDTH=500 HEIGHT=500></APPLET>*/