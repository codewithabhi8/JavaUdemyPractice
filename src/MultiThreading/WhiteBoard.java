package MultiThreading;

public class WhiteBoard {
    String text;
    int noOfStudents=0;
    int count=0;
    public void attendance(){
        noOfStudents++;
    }
    synchronized public void write(String t){
        System.out.println("Teacher is writing "+t);
        while(count!=0)
            try{wait();}catch (Exception e){}
        text=t;
        count=noOfStudents;
        notifyAll();
    }
    synchronized public String read(){
        while(count==0)
            try{wait();}catch (Exception e){}
        String t=text;
        count--;
        if(count==0){
            notify();
        }
        return t;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;
    String[] notes = {"Java is a language", "It is platform independent", "It supports thread", "end"};
    public Teacher(WhiteBoard w) {
        this.wb=w;
    }
    public void run(){
        for(int i=0;i<notes.length;i++) {
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread {
    String name;
    WhiteBoard wb;
    public Student(String name, WhiteBoard wb){
        this.name=name;
        this.wb=wb;
    }
    public void run(){
        String text;
        wb.attendance();
        do{
            text=wb.read();
            System.out.println(name+" reading "+ text);
            System.out.flush();
        }while(!text.equals("end"));
    }

    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("Abhi", wb);
        Student s2 = new Student("Akhi", wb);
        Student s3 = new Student("Mom", wb);
        Student s4 = new Student("Dad", wb);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}