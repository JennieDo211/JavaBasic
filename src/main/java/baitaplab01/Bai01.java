package baitaplab01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Student point: ");

        //float point = scanner.nextInt(); Error
        float point = scanner.nextFloat(); // Variable type must match with the input date scanner method receive

        System.out.println("Student: " +name+", age: "+ Math.round(point));
        scanner.close();
    }
}
