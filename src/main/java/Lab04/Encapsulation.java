package Lab04;

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Hello");
        Student st1 = new Student();
        Student st2 = new Student("Jennie",25);
        st2.setName("New Update Name: Bailey");
        System.out.println("Check Name by getName function: "+st2.getName());
        System.out.println("Check Age by getAge funtcion: "+st2.getAge());
    }
}
