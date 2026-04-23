package org.example;

import java.util.Scanner;

public class ScannerTool {
    public static void main(String[] args) {
        // Scanner is used for enter data from keyboard
        // Example: Declare 2 variables name and age, enter it on keyboard. Print it out to console screen with this format My nam is <name>, age <age>

        // Step 1: Create new Scanner Object
        Scanner scanner = new Scanner(System.in); // Receive data from keyboard -> return String data
        // Step 2: Enter data from keyboard
        System.out.println("Your name is: ");
        String name = scanner.nextLine(); //Receive 1 line (string) from keyboard -> return String data
        System.out.println("Your age is: ");
        int age = scanner.nextInt(); // Receive 1 float number from keyboard -> return integer
        System.out.println("My name is "+name+" age "+age);
        scanner.close();
    }
}
