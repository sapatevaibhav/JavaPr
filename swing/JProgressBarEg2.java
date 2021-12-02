import java.awt.*;
import javax.swing.*;

public class JProgressBarEg2 extends JApplet implements Runnable{
	Container c;
	JProgressBar jp;
	Thread t;
	
	public void init(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		jp=new JProgressBar();
		jp.setStringPainted(true);
		t=new Thread(this);
		t.start();
		c.add(jp);
	}
	
	public void run(){
		int i;
		try{
			for(i=1;i<=100;i++){
				if(i<=50){
					jp.setValue(i);
					jp.setForeground(Color.red);
				}
				else if(i>50&&i<=75){
					jp.setValue(i);
					jp.setForeground(Color.blue);
				}
				else{
					jp.setValue(i);
					jp.setForeground(Color.green);
				}
				Thread.sleep(100);
			}
		}
		catch (InterruptedException ie){
			System.out.println(ie);
		}
	}
}
//<applet code="JProgressBarEg2" height=500 width=500></applet>