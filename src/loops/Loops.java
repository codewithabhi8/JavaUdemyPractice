package loops;

import java.util.Scanner;

public class Loops {
    public void printer(){
        int i=1;
        while(i<100) {
            System.out.println("i is: "+ i);
            i=i*2;
        }
        
        do {
            System.out.println("i is: "+ i);
            i=i*2;
        } while(i<100);
    }
    public void multiplicationTable() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println("The Multiplication table for "+n+" is "+n * i);
        }
    }

    // Sum of n natural numbers
    public void sum(){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("The sum of "+n+" number for is "+sum);
    }

    // Product of n natural numbers.
    public void factorial(){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("The Factorial of "+n+" number for  is "+fact);
    }

    public void displayDigits(){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=0;i<n;i++) {
//            int r= n % 10;
//            System.out.println("Digits are: " + r);
//            n/=10;
//        }
        while(n>0) {
            int r= n % 10;
            System.out.println("Digits are: " + r);
            n/=10;
        }
    }

    public void countDigits(){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0) {
            n/=10;
            count++;
        }
        System.out.println("Number of digits are: " + count);
    }

    public void armstrongNumber() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int arm = 0;
        while(n>0) {
            int r= n % 10;
            arm = arm + r*r*r;
            n/=10;
        }
        if(m==arm){
            System.out.println("The given number is Armstrong number");
        } else {
            System.out.println("The given number is not a Armstrong number");
        }
    }

    public void reverse() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            rev = rev * 10 + n % 10;
            n/=10;
        }
        System.out.println("The reverse of the given number is "+ rev);
    }

    public void palindrome() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int rev = 0;
        while(n>0){
            rev = rev * 10 + n % 10;
            n/=10;
        }
        if(m == rev) {
            System.out.println("The given number is a palindrome" + rev);
        } else {
            System.out.println("The given number is not a palindrome" + rev);
        }
    }

    // Display number in words even with trailing zero
    public void digitDisplayZero() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String rev = "";
        while(n>0){
            int r = n % 10;
            n/=10;
            rev = rev + r;
        }
        for(int i=rev.length()-1;i>=0;i--){
              char c = rev.charAt(i);
              switch(c){
                  case '1':
                      System.out.println("One");
                      break;
                  case '2':
                      System.out.println("Two");
                      break;
                  case '3':
                      System.out.println("Three");
                      break;
                  case '4':
                      System.out.println("Four");
                      break;
                  case '5':
                      System.out.println("Five");
                      break;
                  case '6':
                      System.out.println("Six");
                      break;
                  case '7':
                      System.out.println("Seven");
                      break;
                  case '8':
                      System.out.println("Eight");
                      break;
                  case '9':
                      System.out.println("Nine");
                      break;
                  case '0':
                      System.out.println("Zero");
                      break;
                  default:
                      System.out.println("Please enter valid number ");
            }
        }
    }

    public void APSeries() {
        int a, d, n, term;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        a = sc.nextInt();
        System.out.println("Enter the difference number: ");
        d = sc.nextInt();
        System.out.println("Enter the number of values: ");
        n = sc.nextInt();
        term = a;
        for(int i=0;i<=n;i++) {
            System.out.print(term+",");
            term = term+d;
        }
    }

    public void GPSeries() {
        int a, d, n, term;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        a = sc.nextInt();
        System.out.println("Enter the difference number: ");
        d = sc.nextInt();
        System.out.println("Enter the number of values: ");
        n = sc.nextInt();
        term = a;
        for(int i=0;i<=n;i++) {
            System.out.print(term+",");
            term = term*d;
        }

    }

    public void Fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a=0, b=1, c;
        System.out.print("The Fibonacci Series is: "+a+" "+b);
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.print(" " +c);
            a=b;
            b=c;
        }
    }

    //Patterns nested loops
    public void pattern() {
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        for(int i=2;i<=6;i++) {
//            for(int j=2;j<=6;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5;j++){
//                System.out.print(i+j+" ");
//            }
//            System.out.println();
//        }
//        int count = 0;
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5;j++){
//                System.out.print(++count+" ");
//            }
//            System.out.println();
//        }
//        int count = 0;
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5;j++){
//                System.out.format("%02d ",++count);
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5;j++){
//                if(i>=j) {
//                    System.out.print(j);
//                }
//            }
//            System.out.println();
//        }
//        int count = 0;
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5;j++){
//                if(i>=j) {
//                    System.out.print(++count + " ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5-i+1;j++){
//                    System.out.print(j+ " ");
//            }
//            System.out.println();
//        }
//        for(int i=5;i>=1;i--) {
//            for(int j=1;j<=5;j++){
//                if(j>=i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        //OR
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5;j++){
//                if(i+j>5) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=5;i>=1;i--) {
//            for(int j=1;j<=5;j++){
//                if(j>=i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=1;i<6;i++) {
            for(int k=1;k<=5;k++){
                if(i+k>6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=5;j++){
                if(j<=i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=6;i++) {
            for(int j=1;j<=5;j++){
                if(j>=i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for(int k=6;k>=i;k--){
//                if(i+k>5) {
                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
            }
            System.out.println();
        }


    }

}
