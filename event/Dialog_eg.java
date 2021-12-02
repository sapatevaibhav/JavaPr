import java.awt.*;
import java.awt.event.*;
import java.io.*;				//For The File Handling

public class Dialog_eg implements ActionListener
{
	Frame f;
	MenuBar mb;
	Menu m1;
	MenuItem i1,i2,i3;
	FileDialog fd;
	CheckboxMenuItem cb;
	Label l1;

	Dialog_eg()
	{
		f=new Frame();
		mb=new MenuBar();
		f.setMenuBar(mb);
		
		m1=new Menu("File");
		i1=new MenuItem("New");
		i2=new MenuItem("Open");
		i3=new MenuItem("Save");
		cb=new CheckboxMenuItem("Save All",true);
		l1=new Label();
		
		m1.addActionListener(this);
		mb.add(m1);
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.addSeparator();
		m1.add(cb);
		f.add(l1);
		
		f.setVisible(true);
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		f.setTitle("Menu Example");
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();		//This Command is used to get the action name
		if(s1.equals("Open"))
		{
			fd=new FileDialog(f);
			fd.setVisible(true);
			String s2=fd.getDirectory()+fd.getFile();
			l1.setText("You Selected File ="+s2);
			
		}
	}
	public static void main(String[] args)
	{
		Dialog_eg d=new Dialog_eg();
	}
}