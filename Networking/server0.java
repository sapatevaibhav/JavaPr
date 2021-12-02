import java.io.*;
import java.net.*;

public class server0 {
    public static void main(String[] args) throws Exception{
        String str;
        System.out.println("Server is started");
        ServerSocket ss= new ServerSocket(9999);

        System.out.println("Server is waiting for client to connect");
        Socket s=ss.accept();
        System.out.println("Client is connected");

        InputStreamReader isr=new InputStreamReader(s.getInputStream());
        BufferedReader br=new BufferedReader(isr);
        str=br.readLine();
        System.out.println("Client Data="+str);
        ss.close();
    }
}