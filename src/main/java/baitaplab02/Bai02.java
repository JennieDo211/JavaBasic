package baitaplab02;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;
import static com.sun.org.apache.xalan.internal.lib.ExsltMath.sqrt;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of a: ");
        int a = scanner.nextInt();
        System.out.println("Value of b: ");
        int b = scanner.nextInt();
        System.out.println("Value of c: ");
        int c = scanner.nextInt();
        switch (a){
            case 0:
                if (b == 0 && c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else if (b == 0 && c != 0){
                    System.out.println("Phuong trinh vo nghiem");
                } else {
                    System.out.println("Nghiem phuong trinh x la: "+(-c/b));
                }
                break;
            default:
                double delta = b^2 - 4*a*c;
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
}
