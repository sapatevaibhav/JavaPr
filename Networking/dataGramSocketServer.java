import java.io.*;
import java.net.*;

class dataGramSocketServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] data = new byte[200];
        DatagramPacket packet = new DatagramPacket(data, data.length);

        ds.receive(packet);
        String str = new String(data);
        System.out.println(str);
    }

}
