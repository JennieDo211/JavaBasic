package giaibaitaplab04;

public class ProductDetailUpdate {
    public static void main(String[] args) {
        System.out.println("Hello");
        ProductUpdate testPr1 = new ProductUpdate();
        ProductUpdate pr1 = testPr1.nhapThongTin("Redbull",500,10);
        pr1.xuatThongTin(pr1);
        System.out.println("Tax of Product Update is: "+pr1.getTaxPrice(pr1.getPrice(), pr1.getTax()));


    }
}
