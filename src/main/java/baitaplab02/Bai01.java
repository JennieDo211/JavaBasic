package baitaplab02;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            System.out.println("Nghiem phuong trinh la: " +(-b/a));
        }

        // Switch
/*        switch (a){
            case 0:
                if (b == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            break;
            default:
                System.out.println("Gia tri cua nghiem la: "+(-b/a));
        }*/
        scanner.close();

    }
}
