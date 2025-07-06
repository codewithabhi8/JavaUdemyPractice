package NetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedReverseEcho extends Thread {
    Socket stk;

    MultiThreadedReverseEcho(Socket sk) {
        stk = sk;
    }

    public void run() {
        try {
            BufferedReader bis = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;
            do {
                msg = bis.readLine();

                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();

                ps.println(msg);
            } while (!msg.equals("dne"));
            stk.close();
        } catch (Exception e) {}
    }
        public static void main(String[] args) throws IOException {
            ServerSocket ss = new ServerSocket(2000);
            int count=1;
            Socket stk;
            MultiThreadedReverseEcho re;
            do {
                stk = ss.accept();
                System.out.println("Client Connected: "+count++);
                re = new MultiThreadedReverseEcho(stk);
                re.start();
            }while(true);

        }
    }

    class ClientMulti {
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

