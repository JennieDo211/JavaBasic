package Lab05;

import java.util.ArrayList;

public class ArrayList00 {

/*    1. Primitive type (Kiểu dữ liệu nguyên thủy)

    Bao gồm: (8 loại)
    byte, short, int, long (số nguyên)
    float, double (số thực/số thập phân)
    char (kí tự)
    boolean
    Thực tế, kiểu dữ liệu String không là kiểu dữ liệu nguyên thủy. cơ mà chúng ta hay
    dùng nó như là dữ liệu nguyên thủy =))
    String (chuỗi)

2. Non-Primitive type (reference data type)

    Kiểu dữ liệu "không nguyên thủy" (kiểu dữ liệu tham chiếu) là các kiểu dữ liệu do "lập
    trình viên" định nghĩa ra, bao gồm:
    Class, Interface, Array (gọi chung là Object)
=> Non-Primitive type "viết hoa chữ cái đầu tiên"

** Primitive type sẽ được lưu dứoi dạng giá trị trong bộ nhớ còn Non-Primitive type thì lưu dứoi dạng địa chỉ để tham chiếu ra giá trị

*/

    public static void main(String[] args) {

        int a = 10;
        ArrayList <String> a1 = new ArrayList <String>();
        // a1.add(2); // Tự động convert int (nguyên thuỷ) thành Int (không nguyên thuỷ)
        a1.add("Hello World");
        a1.add("Bailey");

        // Các method hay dùng với Array List
        a1.add("Bup"); // add: Them phan tu
        a1.remove(2); // remove: xoa phan tu
        a1.get(0); // get: Lay ra phan tu cua mang



        System.out.println(a1.toString()+a1.size());
    }



}
