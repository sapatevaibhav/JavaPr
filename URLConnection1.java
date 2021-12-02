import java.io.*;
import java.net.*;

public class URLConnection1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://youtube.com/c/EngineerReveals");
        URLConnection connection = url.openConnection();
        InputStream=connection.getInputStream();
        int i;

        while ((i=stream.read()) != -1) {
            System.out.println((char)i);
        }
    }
}
