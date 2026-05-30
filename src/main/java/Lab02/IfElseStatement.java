package Lab02;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int score = 5;
        if (score > 5) { // Condition is false then code block of if will NOT RUN
        System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


        // Example:
/*        Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
        - dưới 10M: không đóng thuế
        - từ 10M tới 15M: thuế 10%
        - từ 15 tới 30M : thuế 20%
        - trên 30M: thuế 50%
        Ví dụ: nhập vào 25M -> in ra kết quả "thuế 20%"*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of Money to caculate Tax (Million): ");
        int money = scanner.nextInt();
        if (money < 10) {
            System.out.println("No tax");
        } else if (10<=money && money<=15) {
            System.out.println("Tax is 10%: " + (money*0.1));
        } else if (15<money && money<=30) {
            System.out.println("Tax is 20%: " +(money*0.2));
        } else {
            System.out.println("Tax is 50%: " +(money*0.5));
        }
        scanner.close();

    }
}
