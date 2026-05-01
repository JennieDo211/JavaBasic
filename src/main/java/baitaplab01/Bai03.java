package baitaplab01;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Side of the cube: ");
        float cubeSide = scanner.nextFloat();
        System.out.println("Volume of a cube: "+Math.pow(cubeSide,3));
        scanner.close();
    }
}
