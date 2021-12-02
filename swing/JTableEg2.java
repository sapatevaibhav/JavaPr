import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;

public class JTableEg2 extends JApplet implements ListSelectionListener{
    Container c;
    JTable jt;
    JScrollPane jp;
    JLabel l1;

    public void init(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        String col[]={"RollNo","Name","Marks"};
        String data[][]={{"101","aaa","100"},{"102","bbb","99"},{"103","ccc","98"}};

        jt=new JTable(data,col);
        jp=new JScrollPane(jt);
        l1=new JLabel();

        ListSelectionModel model=jt.getSelectionModel();
        model.addListSelectionListener(this);

        c.add(jp);
        c.add(l1);
    }

    public void valueChanged(ListSelectionEvent le){
        int rows[]=jt.getSelectedRows();
        int cols[]=jt.getSelectedColumns();
        String s=" ";

        for(int i=0; i<rows.length; i++){
            for(int j=0; j<cols.length;j++){
                s=s+" "+(String)jt.getValueAt(rows[i],cols[j]);
            }
        }
        l1.setText("Selected Item:"+s);
    }
}
//<applet code="JTableEg2" height=500 width=500></applet>
