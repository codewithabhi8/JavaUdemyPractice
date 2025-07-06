import Abstract.Rectangle;
import Arrays.Arrays;
import Conditional.ConditionalStatements;
import JavaIO.FileWriting;
import Methods.Methods;
import MultiThreading.Customer;
import Operator_and_Expressions.AreaOfTriangle;
import String.StringMethods;
//import Loops.Loops;
import Methods.Circle;
import Exception.*;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
//        AreaOfTriangle area = new AreaOfTriangle();
//        area.swaping();
//        StringMethods sm = new StringMethods();
//        sm.regex();
//        ConditionalStatements cs = new ConditionalStatements();
//        cs.Menu();
//        Loops loop = new Loops();
//        loop.pattern();
//        Arrays array = new Arrays();
//        array.mulMatrix();
//        Methods method = new Methods();
//        int[] A={4,7,2,97,90};
//        int a= method.varArgs(A);
//        System.out.println("Maximum number of the array is "+ a);
//        Circle c1=new Circle();
//        System.out.println("Area: "+c1.area());
//        System.out.println("Perimeter: "+c1.perimeter());
//        System.out.println("Circumference"+ c1.circumference());
//        Rectangle r = new Rectangle();
//        r.length=10;
//        r.breath=11;
//        System.out.println("Area "+r.area());
//        Stacks s = new Stacks(5);
//        try {
//            s.push(10);
////            s.push(16);
////            s.push(99);
////            s.push(44);
////            s.push(76);
////            s.push(43);
////            s.push(87);
//        } catch(StackOverFlow e){
//            System.out.println(e);
//        }
//        try {
//            int x= s.pop();
//            System.out.println(x);
//        } catch(StackUnderFlow e){
//            System.out.println(e);
//        }
        FileWriting fw = new FileWriting();
        fw.storeFloat();
    }
}