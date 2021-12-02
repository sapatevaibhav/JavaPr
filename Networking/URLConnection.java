import java.io.*;
import java.net.*;

public class URLConnection {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://youtube.com/c/EngineerReveals");
        System.out.println("Protocol:" + url.getProtocol());
        System.out.println("Host:" + url.getHost());
        System.out.println("Port:" + url.getPort());
        System.out.println("File:" + url.getFile());
    }
}
