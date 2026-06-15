package baitaplab04;

import java.util.Scanner;

public class Product {
    // Khai bao thuoc tinh
    private String name;
    private double price;
    private double tax;


    // Khai bao action
   public Product (String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public Product() {

    }

    public void nhapThongTin () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product Name: ");
        name = scanner.nextLine();
        System.out.println("Product Price: ");
        price = scanner.nextDouble();
        System.out.println("Product Tax: ");
        tax = scanner.nextDouble();
    }

    public void xuatThongTin () {
        System.out.println("Product Information: "+name+" "+price+" "+tax);
    }

    public double getTaxPrice () {
        double taxPrice = this.price*this.tax;
        return taxPrice;
    }


    //Using Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
