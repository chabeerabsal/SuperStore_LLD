package Modellor;

public class Product {
    private String name;
    private String productID;
    private int price;
    private int quantity;
    private User seller;
    public Product(String name, int price, int quantity, User seller) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public User getSeller() {
        return seller;
    }

    public String getProductID() {
        return productID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
