package baitaplab01;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu Dai: ");
        float length = scanner.nextFloat();
        System.out.println("Chieu Rong: ");
        float width = scanner.nextFloat();
        System.out.println("Perimeter (Chu vi) of a rectangle: "+((length+width)*2));
        System.out.println("Area (Dien tich) of a rectangle: "+(length*width));
        System.out.println("The shortest side of the rectangle: "+Math.min(length,width));
    }
}
