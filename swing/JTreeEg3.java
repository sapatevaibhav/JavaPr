import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.*;

public class JTreeEg3 extends JApplet implements TreeSelectionListener{
    Container c;
    JTree jt;
    DefaultMutableTreeNode root,vnode,fnode,f1,f2,f3,v1,v2,v3; 
    JLabel l1;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        root=new DefaultMutableTreeNode("Root");
        vnode=new DefaultMutableTreeNode("Vegetable");
        fnode=new DefaultMutableTreeNode("Fruit");

        v1=new DefaultMutableTreeNode("Onion");
        v2=new DefaultMutableTreeNode("Carrot");
        v3=new DefaultMutableTreeNode("Potato");
        f1=new DefaultMutableTreeNode("Apple");
        f2=new DefaultMutableTreeNode("Mango");
        f3=new DefaultMutableTreeNode("Banana");

        vnode.add(v1);
        vnode.add(v2);
        vnode.add(v3);
        fnode.add(f1);
        fnode.add(f2);
        fnode.add(f3);

        l1=new JLabel();
        root.add(vnode);
        root.add(fnode);
        jt=new JTree(root);

        jt.addTreeSelectionListener(this);
        c.add(jt);
        c.add(l1);
    }

    public void valueChanged(TreeSelectionEvent te){
        TreePath tp=te.getPath();
        l1.setText(tp.toString());
    }
}
//<applet code="JTreeEg3" height=500 width=500></applet>
