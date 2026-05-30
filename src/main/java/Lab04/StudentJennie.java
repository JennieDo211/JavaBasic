package Lab04;

public class StudentJennie {

    // Khởi tạo Object Student Jennie từ class Student

    public static void main(String[] args) {

        // Student Jennie
        Student jennie = new Student(); // Cách khai báo Object và gán giá trị rỗng
        // Student là kiểu dữ liệu trả về cho biến jennie

        jennie.name = "Jennie"; // Gán giá trị cụ thể cho Object
        jennie.age = 25;

        System.out.println(jennie); // Nếu chỉ viết như này, chỉ in ra địa chỉ lưu trữ trên máy tính của object jennie
        System.out.println("Student with name "+jennie.name+" and age "+jennie.age);

        // Student 



    }

}
