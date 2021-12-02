import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;

public class JTreeEg2 extends JApplet implements MouseListener{
    Container c;
    JTree jt;  
    DefaultMutableTreeNode root,vnode,fnode,v1,v2,v3,f1,f2,f3;
    JLabel l1;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        root=new DefaultMutableTreeNode("Root");
        vnode=new DefaultMutableTreeNode("Vegetable");
        fnode=new DefaultMutableTreeNode("Fruits");

        v1=new DefaultMutableTreeNode("Carrot");
        v2=new DefaultMutableTreeNode("Tomato");
        v3=new DefaultMutableTreeNode("Potato");
        f1=new DefaultMutableTreeNode("Grapes");
        f2=new DefaultMutableTreeNode("Guava");
        f3=new DefaultMutableTreeNode("Mango");

        vnode.add(v1);
        vnode.add(v2);
        vnode.add(v3);
        fnode.add(f1);
        fnode.add(f2);
        fnode.add(f3);

        root.add(fnode);
        root.add(vnode);
        jt=new JTree(root);
        l1=new JLabel();

        jt.addMouseListener(this);
        c.add(jt);
        c.add(l1);
    }

    public void mouseClicked(MouseEvent me){
        TreePath tp=jt.getPathForLocation(me.getX(),me.getY());
        l1.setText(tp.toString());
    }
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
}
//<applet code="JTreeEg2" height=500 width=500></applet>
