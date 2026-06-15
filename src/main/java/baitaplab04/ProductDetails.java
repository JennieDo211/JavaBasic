package baitaplab04;

public class ProductDetails {
    public static void main(String[] args) {
        // Product01
        Product prd01 = new Product();
        prd01.nhapThongTin();
        prd01.xuatThongTin();
        System.out.println("Tax Price of product 01 is: "+prd01.getTaxPrice());

        // Product 02
        Product prd02 = new Product();
        prd02.nhapThongTin();
        prd02.xuatThongTin();
        System.out.println("Tax Price of product 02 is: "+prd02.getTaxPrice());

    }
}
