package baitaplab02;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of Electricity");
        double electricity = scanner.nextDouble();
        double money;
        if (0<electricity && electricity<=100) {
            money = 1000*electricity;
        } else {
            money = 1500*electricity;
        }
        System.out.println("Value of Money for Electricity is: " + money);
        scanner.close();
    }

}
