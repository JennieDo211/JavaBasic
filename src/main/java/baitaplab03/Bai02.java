package baitaplab03;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ban muon xem bang cuu chuong: ");
        int a = scanner.nextInt();
        int plusCaculator;
        for (int i = 1;i<=10;i++) {
            plusCaculator = i*a;
            System.out.printf("%d*%d=%d\n",a,i,plusCaculator);
        }
        scanner.close();
    }
}
