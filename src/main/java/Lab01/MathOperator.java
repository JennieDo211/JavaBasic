package Lab01;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        // Java Math library: https://www.w3schools.com/java/java_math.asp

        // Java Math Methods: https://www.w3schools.com/java/java_ref_math.asp

        //Math.max -> Find the highest value of x and y
/*        int a = 6;
        int b = 9;
        int c = Math.max(a,b);
        System.out.println("Max = "+c);*/

        // Example: Enter 2 numbers from keyboard -> print the largest number to console screen
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Min is: " + Math.min(firstNumber,secondNumber));
        scanner.close();

    }

}
