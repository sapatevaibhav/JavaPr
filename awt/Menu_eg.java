import java.awt.*;
public class Menu_eg 
{
	Frame f;
	MenuBar mb;
	Menu m1,m2;
	MenuItem i1,i2,i3,i4,i5,i6;
	CheckboxMenuItem cb;
	
	Menu_eg()
	{
		f=new Frame();
		mb=new MenuBar();
		f.setMenuBar(mb);
		
		m1=new Menu("File");
		m2=new Menu("Edit");
		
		i1=new MenuItem("New");
		i2=new MenuItem("Open");
		i3=new MenuItem("Save");
		i4=new MenuItem("Cut");
		i5=new MenuItem("Copy");
		i6=new MenuItem("Paste");
		
		cb=new CheckboxMenuItem("Save All",true);
		
		mb.add(m1);
		mb.add(m2);
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.addSeparator();
		m1.add(cb);
		
		m2.add(i4);
		m2.add(i5);
		m2.add(i6);
		
		f.setVisible(true);
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		f.setTitle("MenuBar Example:");
	}
	public static void main(String []args)
	{
		Menu_eg m=new Menu_eg(); 
	}
}