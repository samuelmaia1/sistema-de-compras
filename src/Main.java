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

        Client client = ClientControll.newClient(name, email);

        Order order = OrderControll.newOrder(client, OrderStatus.PROCESSANDO);

        System.out.print("Quantos itens serão adicionados no pedido? ");
        int n = sc.nextInt();

        

        sc.close();
    }
}