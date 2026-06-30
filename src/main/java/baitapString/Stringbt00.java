package baitapString;

import java.util.Scanner;

public class Stringbt00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String userName = scanner.nextLine().trim();
        System.out.println("Password: ");
        String passWord = scanner.nextLine().trim();
        int passWordLength = passWord.length();
        if (passWordLength > 6 && userName.equals("Baileylaconmeo")) {
            System.out.println("Login success");
        } else {
            System.out.println("Incorrect login information");
        }

    }
}
