import java.awt.*;
import javax.swing.*;

public class JProgressBarEg extends JApplet{
	Container c;
	JProgressBar pb;
	
	public void init(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		pb=new JProgressBar();
		pb.setValue(50);
		pb.setForeground(Color.RED);
		pb.setString("Loading...");
		pb.setStringPainted(true);
		c.add(pb);
	}
}
//<applet code="JProgressBarEg" height=500 width=500></applet>
