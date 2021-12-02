import java.awt.*;
import java.awt.event.*;

public class MouseAdapterClassEg extends MouseAdapter{
    Frame f;
    int x,y;
    MouseAdapterClassEg(){
        f=new Frame();
        f.setVisible(true);
        f.setSize(400,300);
        f.setBackground(Color.RED);
        f.setTitle("MouseAdapterClassEg");  
        f.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me){
        Graphics g=f.getGraphics();
        x=me.getX();
        y=me.getY();
        g.drawString(x+" , "+y,x,y);
    }
    public static void main(String[] args) {
        new MouseAdapterClassEg();
    }
}
