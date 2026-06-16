package giaibaitaplab04;

public class ProductUpdate {
    // Khai bao thuoc tinh
    private String name;
    private double price;
    private double tax;


    // Khai bao ham tao khong co tham so
    public ProductUpdate () {

    }
    // Khai bao ham tao co tham so
    public ProductUpdate (String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    // Getter and Setter


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

    // Khai bao action
    public ProductUpdate nhapThongTin(String name, double price, double tax) {
        ProductUpdate pr = new ProductUpdate(name,price,tax);
        return pr;
    }
    public void xuatThongTin(ProductUpdate pr) {
        System.out.println("Product Update Information: "+pr.getName()+" "+pr.getPrice()+" "+pr.getTax());

    }
    public double getTaxPrice(double price, double tax) {
        double taxPrice = price*tax;
        return taxPrice;
    }

}
