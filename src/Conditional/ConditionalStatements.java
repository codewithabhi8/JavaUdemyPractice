package Conditional;

import java.util.Scanner;

public class ConditionalStatements {
    public void oddEven() {
        int num = 13;
        if (num % 2 == 0) {
            System.out.println("It is a even number");
        } else {
            System.out.println("It is a odd number");
        }
    }

    public void young() {
        int age = 18;
        if(age >= 14 && age <=55) {
            System.out.println("The person is Young");
        } else {
            System.out.println("The person is not Young");
        }
    }

    // Grades for given marks
    public void average() {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int avg = (m1 + m2 + m3) / 3;
        if (avg >= 70) {
            System.out.println('A');
        } else if (avg >= 60 && avg < 70) {
            System.out.println('B');
        } else {
            System.out.println('C');
        }
    }

    // Find radix of a number in the string
    public void radix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the radix: ");
        String num = sc.nextLine();
        if (num.matches("[01]+")) {
            System.out.println("It is a Binary number with radix 2");
        } else if (num.matches("[0-7]+")) {
            System.out.println("It is a Octal number with radix 7");
        } else if (num.matches("[0-9]+")) {
            System.out.println("It is a Decimal number with radix 10");
        } else if (num.matches("[0-9A-F]+")) {
            System.out.println("It is a Hexadecimal number with radix 16");
        } else {
            System.out.println("It is not a number");
        }
    }

    // Year is leap year or not
    public void leap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Date to find leap year: ");
        int date = sc.nextInt();
        if(date%4 == 0) {
            if(date%100 == 0) {
                if(date%400 == 0){
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }
            } else {
                System.out.println("It is not a leap year");
            }
        } else {
            System.out.println("It is not a leap year");
        }
    }

    // Display the day based on the number
    public void day() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to get the day of the week: ");
        int date = sc.nextInt();
        switch (date) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter valid number between 1 to 7 ");
        }
    }

    // Find type of website and protocol used
    public void website() {
        String url = "http://google.com";
        String protocol = url.substring(0,url.indexOf(':'));
        if(protocol.equals("http")) {
            System.out.println("Hypertext Transfer Protocol");
        } else if(protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        }
        String ext = url.substring(url.lastIndexOf('.')+1);
        if(ext.equals("com")) {
            System.out.println("Commercial");
        } else if(ext.equals("org")) {
            System.out.println("Organization");
        } else if(ext.equals("net")) {
            System.out.println("network");
        }
    }

    // Menu options for Arithmetic operations
    public void Menu() {
        int a, b, ans;
        String option;
        System.out.println("MENU");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers :");
        a= sc.nextInt();
        b= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option in words :");
        option = sc.nextLine();
        switch (option) {
            case "ADD":
                ans = a + b;
                System.out.println("Addition of given two numbers is: "+ ans);
                break;
            case "SUB":
                ans = a - b;
                System.out.println("Addition of given two numbers is: "+ ans);
                break;
            case "MUL":
                ans = a * b;
                System.out.println("Addition of given two numbers is: "+ ans);
                break;
            case "DIV":
                ans = a / b;
                System.out.println("Addition of given two numbers is: "+ ans);
                break;
            default:
                System.out.println("Enter a valid option ");
                break;
        }

    }
}
