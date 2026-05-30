package Lab01;

public class PrintToConsole {
    public static void main(String[] args) {
        System.out.printf("Bailey us wine\n");
        System.out.printf("Have %d cat in this island\n", 300); //%d: So Nguyen
        System.out.printf("Have %.3f cat in this island\n", 300.555); //%f: So Thuc
        System.out.printf("Have %.0f cat in this island\n", 300.555); //%.0f: So Thuc khong co so le - lam tron so thuc

        //Example: Declare 2 variables name and age. Print it to console screen
        String name = "Bailey";
        int age = 25;
        System.out.printf("My name is %s, age = %d\n", name, age);
        System.out.println("My name is " + name + ",age = " + age);

    }
}
