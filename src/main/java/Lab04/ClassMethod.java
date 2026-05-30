package Lab04;

public class ClassMethod {

    // Class Attributes
    String animalName;
    int age;
    String livingArea;
    boolean hair;


    // Class Method

    /*
    - Để định nghĩa một method của class -> Cần suy nghĩ function sẽ trả về kiểu dữ liệu gì
    => Kiểu giá trị trả về của function
       1. Void -> return nothing (không trả ra kết quả, chỉ đơn thuần thực hiện khối code bên trong)
       2. int -> return dữ liệu có kiểu int
       3. String -> return dữ liệu có kiểu String




    * */


    public void learnJava () {
        System.out.println("Learn Basic Java");
    }


    // Incorrect
    /* void getAge () {
        return 25; -> sẽ báo lỗi vì method void return nothing
     }
     */
    // Correct
    int getAge () {
        return 25;
    }

    String getName () {
        return "Bup";
    }


    // VD: Viết function tính tổng 2 chữ số

    int sum (int a, int b) {
        return a+b;
    }

    // Sử dụng hàm tính tổng

    

}
