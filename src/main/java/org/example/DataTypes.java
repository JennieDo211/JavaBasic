package org.example;

public class DataTypes {
    public static void main(String[] args) {

        //1. Java Numbers: Split into 2 group Integer Types and Float Point Types

        // Integer Types: byte, short, int, long
        // * Declare the correct data type is important. Because data have to be match with purpose of using
        // * For example, can not store number >128 with type byte
        byte oneByte = 127; // lưu trữ dữ liệu từ -128 tới 127
        short oneShort = 5000; // lưu trữ dữ liệu từ -32768 to 32767:
        int oneInteger = 21474836; // lưu trữ dữ liệu từ -2147483648 to 2147483647
        long oneLong = 150000000000L; // lưu ý: cần thêm chữ L, nếu không sẽ quan niệm là "integer"
        // lữu trữ dữ liệu từ -9223372036854775808 to 9223372036854775807 (2^63)

        //2. Float Point Types (Số thực: Số thập phân): float, double


        float oneFloat = 5.766565F; //=> Nếu không có ký tự "f/d" ở cuối biến số => java sẽ coi là biến "double"
        double oneDouble = 5.777777777D;

        //3. Boolean Types (true/false)
        boolean isBupfat = true;
        boolean isMuifat = true;

        //5. Characters Types
        //5.1. Char -> Use to store single character
        char myGrade = 'B'; // Ngoặc đơn để phân biệt với String
        //5.2. String
        String name = "Nghia Do";
        System.out.println(name);








    }
}
