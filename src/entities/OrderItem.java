package entities;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double subTotal(){
        return this.quantity * this.product.getPrice();
    }
}
