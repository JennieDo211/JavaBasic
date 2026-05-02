package baitaplab02;

import java.util.Scanner;

public class Bai04 {

    // Giai phuong trinh bac nhat
    public static void bai01 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solve linear equations Program");
        System.out.println("Value of a: ");
        int a = scanner.nextInt();
        System.out.println("Value of b: ");
        int b = scanner.nextInt();

        // If Else
        if (a ==0 && b==0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float x = (float) (-b/a); // (float) viec khai bao nay bat buoc Java tra ve kieu du lieu float
            System.out.println("Nghiem phuong trinh la: " + x);
        }
        scanner.close();
    }

    // Giai phuong trinh bac hai
    public static void bai02 () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Solve the quadratic equation.s Program");
        System.out.println("Value of a: ");
        int a = scanner.nextInt();
        System.out.println("Value of b: ");
        int b = scanner.nextInt();
        System.out.println("Value of c: ");
        int c = scanner.nextInt();
        switch (a){
            case 0:

                // Cach 1
                if (b == 0 && c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else if (b == 0 && c != 0){
                    System.out.println("Phuong trinh vo nghiem");
                } else {
                    System.out.println("Nghiem phuong trinh x la: "+(-c/b));
                }
                break;
            default:
                double delta = Math.pow(b, 2) - 4*a*c;
                if (delta<0) {
                    System.out.println("Phuong trinh vo nghiem");
                } else if (delta == 0) {
                    System.out.println("Phuong trinh co nghiem kep x: " + (-b/2*a));
                } else {
                    System.out.println("Phuong trinh co 2 nghiem rieng biet");
                    double x1 = (-b+Math.sqrt(delta))/(2*a);
                    double x2 = (-b-Math.sqrt(delta))/(2*a);
                    System.out.println("Nghiem x1 la: "+x1);
                    System.out.println("Nghiem x2 la: "+x2);
                }
        }
        scanner.close();
    }

    // Tinh tien dien
    public static void bai03 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate Electricity Money Program");
        System.out.println("Enter Value of Electricity");
        double electricity = scanner.nextDouble();
        double money;
        if (0<electricity && electricity<=100) {
            money = 1000*electricity;
        } else {
            money = 100*1000+(electricity-100)*1500;
        }
        System.out.println("Value of Money for Electricity is: " + money);
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("Choose you Calculator Function");
        System.out.println("|1: Solve linear equations");
        System.out.println("|2: Solve the quadratic equation.s");
        System.out.println("|3: Calculate Electricity Money");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice is: ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                System.out.println("You have chosen 1: ");
                bai01();
                break;
            case 2:
                System.out.println("You have chosen 2: ");
                bai02();
                break;
            default:
                System.out.println("You have chosen 3: ");
                bai03();
        }
        scanner.close();
    }
}
