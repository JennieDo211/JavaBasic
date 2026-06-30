package baitapString;

import java.util.ArrayList;

public class StudentDetails {
    public static void main(String[] args) {

        // Cách 1
        // Student 01
/*        Student stu01 = new Student ();
        stu01.setName("Nguyễn Văn A");
        stu01.setId(12345);
        System.out.println(stu01.getName());

        //Student 02
        Student stu02 = new Student ();
        stu02.setName("Đỗ Thị Đức Nghĩa");
        stu02.setId(021101);

        //Student 03
        Student stu03 = new Student();
        stu03.setName("Mèo Hà Nè");
        stu03.setId(060300);

        //Student 04
        Student stu04 = new Student();
        stu04.setName("Đỗ Xí Búp");
        stu04.setId(240526);

        //Student 05
        Student stu05 = new Student();
        stu05.setName("Đỗ Xí Mụi");
        stu05.setId(888888);*/


        // Cách 2
        ArrayList <Student> listOfStudent = new ArrayList<>();

        // Student details
        Student stu01 = new Student("Nguyễn Văn A",12345);
        Student stu02 = new Student("Đỗ Thị Đức Nghĩa",21101);
        Student stu03 = new Student("Mèo Hà Nè",60300);
        Student stu04 = new Student("Đỗ Xí Búp",240526);
        Student stu05 = new Student("Đỗ Xí Búp",188888);

        // Add Object to Array List
        listOfStudent.add(stu01);
        listOfStudent.add(stu02);
        listOfStudent.add(stu03);
        listOfStudent.add(stu04);
        listOfStudent.add(stu05);





        // Check
        System.out.println(listOfStudent.get(1));

        boolean isStuNameMatch = false;
        // Find student that name start with Đỗ
        for (Student u : listOfStudent) {
            String stuName = u.getName();
            if (stuName.startsWith("Đỗ")) {
                System.out.println("Student name start with Đỗ are: " + stuName);
            }
        }
        }
    }
