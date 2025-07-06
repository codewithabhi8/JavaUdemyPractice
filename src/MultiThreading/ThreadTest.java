package MultiThreading;


class MyThread extends Thread{
    public void run() {
        int i = 1;
        while (true) {
            System.out.print("Hello");
            i++;
        }
    }
}

public class ThreadTest {
    public static void main(String args[]) {
        MyThread m= new MyThread();
        m.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}
