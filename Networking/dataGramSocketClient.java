import java.io.*;
import java.net.*;

public class dataGramSocketClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] data = "Good Morning".getBytes();

        InetAddress address = InetAddress.getByName("localhost");
        int port = 3000;
        DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
        ds.send(packet);
    }
}
