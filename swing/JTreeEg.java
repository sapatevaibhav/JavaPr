import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeEg extends JApplet{
    Container c;
    JTree jt;
    DefaultMutableTreeNode root,fnode,vnode,f1,f2,f3,v1,v2,v3;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        root=new DefaultMutableTreeNode("Root");
        vnode=new DefaultMutableTreeNode("Vegetables");
        fnode=new DefaultMutableTreeNode("Fruit");

        v1=new DefaultMutableTreeNode("Carrot");
        v2=new DefaultMutableTreeNode("Cabbage");
        v3=new DefaultMutableTreeNode("Potato");

        f1=new DefaultMutableTreeNode("Mango");
        f2=new DefaultMutableTreeNode("Apple");
        f3=new DefaultMutableTreeNode("Grapes");

        vnode.add(v1);
        vnode.add(v2);
        vnode.add(v3);
        fnode.add(f1);
        fnode.add(f2);
        fnode.add(f3);

        root.add(vnode);
        root.add(fnode);
        jt=new JTree(root);
        c.add(jt);
    }
}
//<applet code="JTreeEg" height=500 width=500></applet>
