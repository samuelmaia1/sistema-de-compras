package entities;
import entities.enums.OrderStatus;

import entities.OrderItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {
    private String id;
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> orderItens = new ArrayList<OrderItem>();
    private Client client;

    public Order(OrderStatus status, Date moment, Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;

        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItens() {
        return this.orderItens;
    }

    public void setOrderItens(List<OrderItem> orderItens) {
        this.orderItens = orderItens;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        this.orderItens.add(item);
    }

    public double totalValue(){
        double sum = 0;

        for (OrderItem item : orderItens){
            sum += item.subTotal();
        }

        return sum;
    }

    public String toString(){
        String orderData = "\n\nCliente: " + this.client.getName() + "\nEmail: " + this.client.getEmail() + "\nMomento do pedido: " + this.moment + "\nStatus: " + this.status + "\nItens: \n";

        for (OrderItem item : orderItens){
            orderData += item.getProduct().getName() +  ", R$" + item.getProduct().getPrice() + ", " + item.getQuantity() + " unidades\n";
        }

        orderData += "Total do pedido: R$" + this.totalValue();

        return orderData;
    }
}
