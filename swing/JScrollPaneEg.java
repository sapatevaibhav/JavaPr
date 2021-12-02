import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;

public class JScrollPaneEg extends JApplet{
	Container c;
	Panel p;
	JScrollPane sp;
	
	public void init(){
		Container c=getContentPane();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(20,20));
		int k=1;
		
		for(int i=1;i<=20;i++){
			for(int j=1; j<=20; j++){
				p.add(new JButton("Button "+k));
				k++;
			}
		}
		sp=new JScrollPane(p);
		c.add(sp);
	}
}
//<applet code="JScrollPaneEg" height=500 width=500></applet>