package baitaplab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrNum = new ArrayList<>();
        while (true) {
            System.out.println("Enter your number: ");
            double num = scanner.nextDouble();
            arrNum.add(num);
            scanner.nextLine(); // xử lý ký tự xuống dòng còn sót lại sau nextDouble()
            System.out.println("Enter more number: Y/N");
            String isContinue = scanner.nextLine();
            if (isContinue.equals("N")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Your Array List"+arrNum.toString());

        // Tinh tong
        double sum = 0;
        for (int i = 0; i < arrNum.size();i++){
            sum = sum + arrNum.get(i);
        }

        System.out.println("Sum is: "+sum);
    }
}
