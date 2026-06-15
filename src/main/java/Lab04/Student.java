package Lab04;

public class Student {

    // Khai báo thuộc tính
    private String name;
    private int age;

    // Hàm tạo mặc định bởi Java
    public Student() {

    }


    // Khai báo hành vi (Function/Method của một Class)
    public void learnJava () {
        System.out.println("Learn Basic Java");
    }




    public Student (String name, int age) {
        this.name = name; // This -> Gán giá trị cho thuộc tính của class -> Thuộc tính name của class Student sẽ có giá trị là name1
        this. age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*    public String getName () {
        return this.name;
    }
    public int getAge () {
        return this.age;
    }

    public void setName (String name1) {
        this.name = name1;
    }
    public void setAge (int age1) {
        this.age = age1;
    }*/



}


