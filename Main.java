class Product {
    private String name;
    private String category;
    private double price;
    private int stockQuantity;
    private String supplierEmail;

    public Product(String name, String category, double price, int stockQuantity, String supplierEmail) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.supplierEmail = supplierEmail;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void restock(int quantity) {
        stockQuantity += quantity;
        System.out.println("Uzupełniono zapasy o " + quantity + " sztuk.");
    }

    public void sell(int quantity) {
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity;
            System.out.println("Sprzedano " + quantity + " sztuk.");
        } else {
            System.out.println("Niewystarczająca ilość w magazynie.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product("krzyś", "nerka", 2500.0, 50, "cwl@gmail.com");
        System.out.println(p.getName());
        System.out.println(p.getCategory());
        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());
        System.out.println(p.getSupplierEmail());
        p.restock(20);
        p.sell(30);
        p.sell(50);
    }
}
