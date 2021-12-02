import java.io.*;
import java.net.*;

public class client0 {
    public static void main(String[] args) throws Exception {
        String str;
        Socket s = new Socket("localhost", 9999);
        PrintWriter out = new PrintWriter(s.getOutputStream());
        out.println("Good Morning server");
        out.flush();

        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        str = br.readLine();
        System.out.println("Server data:" + str);
        s.close();
    }
}
