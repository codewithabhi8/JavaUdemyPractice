package Operator_and_Expressions;
import java.lang.*;
import java.util.Scanner;

public class AreaOfTriangle {
    public void area() {
        // Find the area of the Triangle 1/2 * Base * Height
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base of the triangle : " );
        float base = sc.nextFloat();
        System.out.print("Enter the Height of the triangle : " );
        float height = sc.nextFloat();
        float area = (base * height) / 2;
        System.out.print("Area of Triangle is : " + area);
    }

    public void areaDiffSides() {
        // Find the area of the Triangle 1/2 * a * b * c
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First side of the triangle : " );
        int a = sc.nextInt();
        System.out.print("Enter the Second side of the triangle : " );
        int b = sc.nextInt();
        System.out.print("Enter the Third side of the triangle : " );
        int c = sc.nextInt();
        float s = (a + b + c) / 2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("Area of Triangle is : " + area);
    }

    public void quadraticEquation() {
        int a,b,c;
        double r1, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a, b, c ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double sqrt = Math.sqrt(b * b - 4 * a * c);
        r1 = (-b+ sqrt)/(2*a);
        r2 = (-b- sqrt)/(2*a);
        System.out.println("The root values of the equation is "+r1+" "+r2);
    }

    public void cuboid() {
        // Display total area and volume
        int length, breadth, height;
        int totalArea, totalVolume;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length, Breadth, Height: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        totalArea = 2*(length*breadth+breadth*height+height*length);
        totalVolume = length*breadth*height;
        System.out.println("Total Area: "+ totalArea + " Total Volume: " + totalVolume);
    }

    // Swapping of 2 numbers with bitwise operator
    public void swaping() {
        int a=890, b=675;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Numbers After Swapping: "+ a+ " "+ b);
    }
}

