import entities.*;
import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String name = sc.nextLine();
        System.out.print("E=mail do cliente: ");
        String email = sc.nextLine();

        Client client = new Client(name, email);

        Order order = new Order(OrderStatus.PROCESSANDO, client);

        System.out.print("Quantos itens serão adicionados no pedido? ");
        int n = sc.nextInt();

        OrderControll.addItens(n, order);

        System.out.printf("" + order);

        sc.close();
    }
}