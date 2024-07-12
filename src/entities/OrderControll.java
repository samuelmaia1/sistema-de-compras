package entities;

import entities.enums.OrderStatus;

import java.util.Date;

public class OrderControll {
    public static Order newOrder(Client client, OrderStatus status){
        return new Order(status, new Date(), client);
    }
}
