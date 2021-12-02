import java.awt.*;
import java.applet.*;
public class txtar extends Applet
{
	TextArea ta;
	public void init()
	{
		ta=new TextArea("WELCOME... ");
		ta.append(" GOOD MORNING");
		ta.insert("STUDENTS", 11);
		ta.replaceRange("HAVE A VERY GOOD DAY.... :-D  <3",20,32);
		
		add(ta);
	}
}
/*<APPLET code="txtar" width=500 height=500></APPLET>*/