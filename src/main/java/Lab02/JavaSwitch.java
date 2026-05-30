package Lab02;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) {
        // Switch help not to use if else to many times -> Code will be clearer
        // Example Bài tập: Viết chương trình lựa chọn chức năng
        //Yêu cầu:
        //Nếu nhập vào 1 => in ra "Bạn đã lựa chọn phép cộng"
        //Nếu nhập vào 2 => in ra "Bạn đã lựa chọn phép trừ"
        //Nếu nhập vào 3 => in ra "Bạn đã lựa chọn thoát chương trình" => System.exit(0);

        System.out.println("Chose your Calculator Function");
        System.out.println("|1: Plus");
        System.out.println("|2: Minus");
        System.out.println("|3: End");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Selection is: ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                System.out.println("You have chosen Plus ");
                break;
            case 2:
                System.out.println("You have chosen Minus");
                break;
            default: // Execute when the value of variable not match with any case
                System.out.println("You have chosen to leave the program");
                System.exit(0); // Out of the program
        }
        scanner.close();


    }
}
