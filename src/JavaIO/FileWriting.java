package JavaIO;

import java.io.*;
import java.util.Scanner;

public class FileWriting {
    public void copy() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\source1.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\source2.txt");
        int b;
        while((b=fis.read())!=-1) {
            if(b>=65 && b<=120) fos.write(b+32);
            else fos.write(b);
        }
        fis.close();
        fos.close();
    }

    public void destination() throws IOException {
        FileInputStream fis1 = new FileInputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\source1.txt");
        FileInputStream fis2 = new FileInputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\source2.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\destination.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        int b;
        while((b=sis.read())!=-1) {
            fos.write(b);
        }
        fis1.close();
        fis2.close();
        fos.close();
        sis.close();
    }

    public void storeFloat() throws IOException {
        float[] list = {10.5f, 2.9f, 6.4f, 3.7f};
        FileOutputStream fos = new FileOutputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\Data.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(list.length);
        for(float x: list)
            dos.writeFloat(x);
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\Data.txt");
        DataInputStream dis = new DataInputStream(fis);
        int length = dis.readInt();
        float data;
        for(int i=0;i<length;i++){
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
}

class Customer implements Serializable{
    String custId;
    String name;
    String phoneNumber;
    static int count=1;

    Customer(){}

    Customer(String n, String p) {
        custId="C"+count;
        count++;
        name=n;
        phoneNumber=p;
    }

    public String toString() {
        return "Customer ID:"+custId+"Name: "+name+"Phone Number: "+phoneNumber+"\n";
    }
}
class SerialMain {
//    public static void main(String[] args) throws IOException {
//        Customer[] list = {new Customer("Smith", "0986765453"),new Customer("Abhi","9876543210")};
//        FileOutputStream fos = new FileOutputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\Customer.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeInt(list.length);
//        for(Customer c:list)
//            oos.writeObject(c);
//        oos.close();
//        fos.close();
//    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int length = ois.readInt();
        Customer list[] = new Customer[length];
        for (int i = 0; i < length; i++) {
            list[i] = (Customer) ois.readObject();
        }
        System.out.println("Enter the name of Customer ");
        String name = sc.nextLine();
        for (int i = 0; i < length; i++) {
            if (name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }
        ois.close();
        fis.close();
    }
}

