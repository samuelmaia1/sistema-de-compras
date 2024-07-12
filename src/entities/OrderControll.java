package entities;

import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class OrderControll {
    public static Order newOrder(Client client, OrderStatus status){
        return new Order(status, new Date(), client);
    }

    public static void addItens(int n, Order order){
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= n; i++){
            System.out.println("Item #" + i);

            System.out.print("Nome do produto: ");
            String productName = sc.nextLine();

            System.out.print("Preço: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();

            sc.nextLine();

            order.addItem(new OrderItem(new Product(productPrice, productName), quantity));
        }
    }
}
