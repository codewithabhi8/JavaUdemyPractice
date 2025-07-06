package Collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

//class MyComparator implements Comparator<Integer>{
//    public int compare(Integer o1, Integer o2) {
//        if(o1<o2) return 1;
//        if(o1>o2) return -1;
//        else return 0;
//    }
//}

//class Point implements Comparable {
//    int x, y;
//    Point(int x, int y) {
//        this.x=x;
//        this.y=y;
//    }
//    public String toString() {
//        return "x: "+x+" "+"y: "+y;
//    }
//
//    public int compareTo(Object o) {
//        Point p=(Point) o;
//        if(this.x<p.x) return -1;
//        else if(this.x>p.x) return 1;
//        else{
//            if(this.y<p.y) return -1;
//            else if(this.y>p.y) return 1;
//            else return 0;
//        }
//    }
//}

public class ListDemo {
    public static void main(String[] args) throws IOException {
//        ArrayList<Integer> al1 = new ArrayList<>(20);
//        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));
//        al1.add(10);
//        al1.add(0,5);
//        al1.addAll(1, al2);
//        boolean b= al1.contains(50);
//        System.out.println(b);
//        System.out.println(al1);
//        System.out.println(al1.get(5));
//        System.out.println(al1.indexOf(70));
//        System.out.println(al1.set(6, 100));
//        for(int i=0;i< al1.size();i++)
//            System.out.print(al1.get(i)+" ");
//        Iterator<Integer> it = al1.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        ListIterator<Integer> itl = al1.listIterator();
//        while(itl.hasNext()){
//            System.out.println(itl.previous());
//        }
//        al1.forEach(n-> System.out.println(n));
//        al1.forEach(System.out::println);

        // Array Dequeue
//        ArrayDeque<Integer> dq = new ArrayDeque<>();
//        dq.offerLast(10);
//        dq.offerLast(20);
//        dq.offerLast(30);
//        dq.offerLast(40);
//        dq.offerFirst(1);
//        dq.offerFirst(2);
//        dq.offerFirst(3);
//        dq.offerFirst(4);
//        dq.forEach((x)-> System.out.println(x));

        // Priority Queue
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
//        pq.add(20);
//        pq.add(10);
//        pq.add(30);
//        pq.add(5);
//        pq.add(15);
//        pq.add(3);
//
//        System.out.println(pq.peek());
//        pq.forEach(x-> System.out.println(x));
//        pq.poll();
//        pq.forEach(x-> System.out.println("After deletion "+x));

        // HashSet
//        HashSet<Integer> hs = new HashSet<>(20,0.5f);
//        hs.add(10);
//        hs.add(30);
//        hs.add(20);
//        hs.add(10);
//        System.out.println(hs);

        // TreeSet
//        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 20, 50, 40));
//        ts.add(25);
//        System.out.println(ts);
//        System.out.println(ts.ceiling(24));

        // Comparable
//        TreeSet<Point> ts = new TreeSet<>();
//        ts.add(new Point(1,1));
//        ts.add(new Point(5,10));
//        ts.add(new Point(5,6));
//        System.out.println(ts);

        // Tree Map
//        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));
//        tm.put(4,"E");
//        tm.put(5,"F");
//        System.out.println(tm);
//        System.out.println(tm.ceilingEntry(5).getValue());
//        System.out.println(tm.containsKey(5));
//        System.out.println(tm.get(5));
//        Entry<Integer, String> e = tm.firstEntry();
//        System.out.println(e.getKey()+" "+e.getValue());

        // HashMap
//        HashMap<Integer, String> tm = new HashMap<>(Map.of(0,"A",1,"B",2,"C"));
//        tm.put(4,"E");
//        tm.put(5,"F");
//        System.out.println(tm);
////        System.out.println(tm.ceilingEntry(5).getValue());
//        System.out.println(tm.containsKey(5));
//        System.out.println(tm.get(5));
////        Entry<Integer, String> e = tm.firstEntry();
////        System.out.println(e.getKey()+" "+e.getValue());

        // Linked Hash Map
//        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5,0.5f, true){
//            protected boolean removeEldestEntry(Map.Entry e) {
//                return size()>5;
//            }
//        };
//        lhm.put(1,"A");
//        lhm.put(2,"B");
//        lhm.put(3,"C");
//        lhm.put(4,"D");
//        lhm.put(5,"E");
//        lhm.put(6,"F");
//        lhm.get(5);
//        lhm.get(2);
//        lhm.put(7,"U");
//        lhm.forEach((x,y)->System.out.println(x+ y));

        // Tokenizer
//        String data="name=Abhi;address=Hyd;country=India;dept=CSE";
//        StringTokenizer stk = new StringTokenizer(data,"=;");
//        while(stk.hasMoreTokens()) {
//            System.out.println(stk.nextToken());
//        }


//        FileInputStream fis = new FileInputStream("D:\\Abhi\\Java Practice Udemy\\Abdul Bari Udemy Java Course\\src\\Numbers.txt");
//        byte b[] = new byte[fis.available()];
//        fis.read(b);
//
//        String data= new String(b);
//        ArrayList<Integer> al = new ArrayList<>();
//
//        StringTokenizer stk = new StringTokenizer(data,",");
//        while(stk.hasMoreTokens()) {
//            String s= stk.nextToken();
//            al.add(Integer.valueOf(s));
//        }
//        System.out.println(al);


        
    }
}

