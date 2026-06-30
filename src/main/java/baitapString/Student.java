package baitapString;

import giaibaitaplab04.ProductUpdate;

import java.util.ArrayList;

public class Student {
    // Khai bao thuoc tinh
    private String name;
    private int id;

    // Khai bao ham tao khong co tham so
    public Student() {
    }

    // Khai bao ham tao co tham so
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    // Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ho ten: "+getName()+"\n"+"ID: "+getId();
    }

}
