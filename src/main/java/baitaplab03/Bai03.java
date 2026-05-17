package baitaplab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Nhập kích thước mảng
        System.out.println("Enter Arrays Length Expect: ");
        int arrLength = scanner.nextInt();
        // 2. Khởi tạo mảng với kích thước n
        int[] arr = new int[arrLength];
        // 3. Nhập từng phần tử cho mảng
        System.out.println("Enter value of Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("This is value of index:" + i);
            int valueOfArr = scanner.nextInt();
            arr[i] = valueOfArr;
        }
        System.out.println("Arr that you enter is: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int maxTemp = arr[i]; // Gán max tạm thời là i nếu i lớn hơn j (VD: 15>8)
                    arr[i] = arr[j]; // Đổi chỗ cho 15 và 8 -> 8;15
                    arr[j] = maxTemp; // gán 15 là j
                }
            }
        }

        // Tim phan tu lon nhat
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max is: " + max);

        // Tim phan tu nho nhat
        int min = arr[0];
        for (int i = 0; i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min is: "+min);


        System.out.println("New sorted arr: " + Arrays.toString(arr));
        System.out.println("Smallest value: " + arr[0]);
        System.out.println("Largest value: " + arr[arr.length - 1]);
        scanner.close();


    }
}
