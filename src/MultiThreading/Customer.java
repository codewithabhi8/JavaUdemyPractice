package MultiThreading;

class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println("Customer "+ name + " is checking the Balance");
        try{Thread.sleep(1000);}catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println(name +" is withdrawing "+ amount);
        try{Thread.sleep(1000);}catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Customer extends Thread {
    ATM atm;
    String name;
    int amount;
    public Customer(String name, int amount, ATM atm) {
        this.name=name;
        this.amount=amount;
        this.atm=atm;
    }
    public void useAtm() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run() {
        useAtm();
    }
    public static void main(String[] args){
        ATM atm = new ATM();
        Customer c1 = new Customer("Abhi", 100, atm);
        Customer c2 = new Customer("Akhi", 999, atm);
        c1.start();
        c2.start();
    }
}
