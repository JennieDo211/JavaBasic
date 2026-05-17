package Lab03;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*- Array dùng để lưu trữ nhiều value trong 1 variable duy nhất -> không tốn công khai báo nhiều lần.
        - Khi khai báo array bắt buộc phải gán giá trị cho array đó, không thể khai báo array và k gán giá trị
        - Array có 2 thành phần chính:
        + Giá trị mà nó lưu trữ
        + Chỉ số của giá trị đó
        - Phần tử đầu tiên của Array có chỉ số 0
        - Có 2 cách để thay đổi value trong Array:
        + 1/ Chỉnh trực tiếp trong Array
        + 2/ Chỉnh bằng <array's name>[index] = <new value>;
        + Hàm Arrays.toString help to convert Array to String on screen for us to see
        */


        String[] cat = {"Bup", "Mui", "Nuoc Dua", "Sang"};
        int [] numbers = {15,8,2,10,100};
        cat[3] = "Nuoc Dua Den Thui";
        System.out.println("Cat Name: " + Arrays.toString(cat));
        System.out.println("Array Length: " + cat.length);
        System.out.println("Index Element: " + cat[3]);
        // System.out.println("Index out of bound" + cat[10]); // Error
        // System.out.println("Sort" + Arrays.sort(numbers)); // Error -> Sort first then print
        Arrays.sort(numbers);
        System.out.println("Sort"+Arrays.toString(numbers));

        // Cách giải bằng for Loop
        for (int i = 0; i<numbers.length-1;i++) {
            for (int j = i+1; j<numbers.length;j++) {
                if (numbers[i]>numbers[j]) {
                    int maxTemp = numbers [i]; // Gán max tạm thời là i nếu i lớn hơn j (VD: 15>8)
                    numbers[i]=numbers[j]; // Hoán đổi j về i VD: 8;15
                    numbers[j] = maxTemp; // Sau đó j mang giá trị mới là maxtemp
                }
            }
        }
        System.out.println("New Sort Arrays"+Arrays.toString(numbers));




    }
}
