package baitaplab03;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        // Xác định một số có phải số nguyên tố hay không
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your check number: ");
        double checkNumber = scanner.nextDouble();
        // Số nguyên tố chỉ chia hết cho 1 và chính nó -> 1<a<value -> trong khoản từ a thì checknumber k được chia hết cho số nào khác
        // Example: 4 -> Array [1 2 3 4] -> Duyệt để tìm ra nếu có số mà 4 chia hết thì không phải số nguyên tố
        int count = 0;
        if (checkNumber<2) {
            System.out.println("This is not Prime Number");
            return; // Use this to stop in if case
        } else {
            for (int i = 2; i<=Math.sqrt(checkNumber); i++) {
               if (checkNumber % i==0) {
                   System.out.println("Other divisor: "+i);
                   count=count+1;
                   break;
               }
            }
        }
        if (count == 0) {
            System.out.println("This is prime number");
        } else {
            System.out.println("This is not prime number");
        }
        scanner.close();

    }
}
