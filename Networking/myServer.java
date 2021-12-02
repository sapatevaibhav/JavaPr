import java.io.*;
import java.net.*;

public class myServer {
    public static void main(String[] args) throws Exception {
        String str;
        System.out.println("Server is Started");
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("Server is waiting for client");

        Socket s = ss.accept();
        System.out.println("Client is connected");
        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        str = br.readLine();
        System.out.println("Client data:"+str);
        PrintWriter out = new PrintWriter(s.getOutputStream());

        out.println("Good Morning Client");
        out.flush();
        ss.close();
    }
}
