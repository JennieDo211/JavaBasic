package org.example;

public class JavaOperators {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_operators.asp
        //1. Toán tử số học (Arithmetic Operators)
        int a = 8;
        int b = 9;
        System.out.println("Plus: "+ (a+b));
        System.out.println("Minus: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b)); // Chia lay phan du
        System.out.println("Increment: "+(++a)); // Tang a them 1 don vi
        System.out.println("Decrement: "+(--a)); // Giam di a 1 don vi

        //2. Java Assignment Operators
        int c = 18; // Lay gia tri ben tay phai gan cho ben trai
        c += 2; // c = c + 18 -> 20
        System.out.println("result of c: " + c);

        // 3. Java Comparision Operators c
        int d = 10;
        int e = 12;
        System.out.println("d is greater then e: " + (d>e));

        // 4. Java Logical Operators -> result is boolean true/false
        int f = 5;
        System.out.println("&&: if 1 AND 2 is correct -> return true: " + (f<=5 && f<10));
        System.out.println("||: if 1 OR 2 is correct -> return true: " + (f>3 || f<4));
        System.out.println("!: return false if result is true: " + !(f>3 || f<4));





    }
}
