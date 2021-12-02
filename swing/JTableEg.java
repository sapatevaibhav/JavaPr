import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class JTableEg extends JApplet{
    Container c;
    JTable jt;
    JScrollPane jp;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        String col[]={"RollNo","Name","Percentage"};
        String data[][]={{"101","aaa","99.99"},{"102","bbb","88.88"},{"103","ccc","77.77"}};

        jt=new JTable(data,col);
        jp=new JScrollPane(jt);
        c.add(jp);
    }
}
//<applet code="JTableEg" height=500 width=500></applet>
