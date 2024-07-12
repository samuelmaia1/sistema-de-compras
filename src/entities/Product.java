package entities;
import java.util.UUID;

public class Product {
    private double price;
    private String id;
    private String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;

        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
