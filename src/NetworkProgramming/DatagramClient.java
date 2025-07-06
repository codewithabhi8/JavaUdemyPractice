package NetworkProgramming;
import java.net.*;

public class DatagramClient{
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        String msg = "Hello World";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2000);
        ds.send(dp);

        byte[] b=new byte[1024];
        dp = new DatagramPacket(b, b.length);
        ds.receive(dp);

        msg=new String(dp.getData()).trim();
        System.out.println("From server "+msg);
        ds.close();
    }
}

class DatagramServer{
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();

        byte[] b=new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);
        String msg=new String(dp.getData()).trim();
        System.out.println("From client "+msg);
        StringBuilder sb = new StringBuilder(msg);
        msg=sb.reverse().toString();
        dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2001);
        ds.send(dp);



        ds.close();
    }
}