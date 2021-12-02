import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListSelectionEventEg extends JApplet implements ListSelectionListener{
	Container c;
	JList jl1;
	DefaultListModel lm;
	JLabel l1;
	
	public void init(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		lm=new DefaultListModel();
		lm.addElement("Integer");
		lm.addElement("Character");
		lm.addElement("String");
		lm.addElement("Array");
		lm.addElement("Boolean");
		
		l1=new JLabel();
		jl1=new JList(lm);
		jl1.addListSelectionListener(this);
		
		c.add(jl1);
		c.add(l1);
	}
	
	public void valueChanged(ListSelectionEvent le){
		String str=(String)jl1.getSelectedValue();
		l1.setText("Selected Items:"+str);
	}
}
//<applet code="ListSelectionEventEg" height=500 width=500></applet>

					  
					  
					  
					  
					  
					  
					  