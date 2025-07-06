package MultiThreading;

public class WithRunnable implements Runnable{
    public void run() {
        int i = 1;
        while (true) {
            System.out.print("Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        MultiThreading.WithRunnable m= new MultiThreading.WithRunnable();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}
