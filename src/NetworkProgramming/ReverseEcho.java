package NetworkProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEcho {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();
        BufferedReader bis = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do{
            msg = bis.readLine();

            sb = new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);
        }while(!msg.equals("dne"));

    }
}

class Client {
    public static void main(String[] args) throws IOException {
        Socket stk = new Socket("localhost",2000);

        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bis = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        do{
            msg = keyb.readLine();
            ps.println(msg);
            msg=bis.readLine();
            System.out.println("From Server "+msg);
        }while(!msg.equals("dne"));
        stk.close();
    }
}