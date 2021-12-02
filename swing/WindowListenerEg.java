import java.awt.*;
import java.awt.event.*;

public class WindowListenerEg implements WindowListener {
    Frame f;

    WindowListenerEg() {
        f = new Frame();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setBackground(Color.RED);
        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent we) {
        System.out.println("Window closing");
        System.exit(0);
    }

    public void windowActivated(WindowEvent we) {
        System.out.println("Window activated");
    }

    public void windowDeactivated(WindowEvent we) {
        System.out.println("Window deactivated");
    }

    public void windowOpened(WindowEvent we) {
        System.out.println("Window opened");
    }

    public void windowClosed(WindowEvent we) {
        System.out.println("Window closed");
    }

    public void windowIconified(WindowEvent we) {
        System.out.println("Window iconified");
    }

    public void windowDeiconified(WindowEvent we) {
        System.out.println("Window deiconified");
    }

    public static void main(String args[]) {
        new WindowListenerEg();
    }
}
