package baitaplab04;

public class ProductDetailsbyGetAndSet {
    public static void main(String[] args) {
        Product prd03 = new Product();
        prd03.setName("Bailey");
        prd03.setPrice(100);
        prd03.setTax(20);
        prd03.nhapThongTin();
        prd03.xuatThongTin();
    }
}
