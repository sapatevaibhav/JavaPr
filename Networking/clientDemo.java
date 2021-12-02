import java.io.*;
import java.net.*;

public class clientDemo {
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",9999);
        PrintWriter out=new PrintWriter(s.getOutputStream());
        out.println("Welcome");
        out.flush();
        s.close();
    }

}
