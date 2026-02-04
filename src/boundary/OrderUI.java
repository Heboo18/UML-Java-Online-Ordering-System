package boundary;

import control.OrderController;
import entity.Order;
import entity.Product;
import entity.User;

public class OrderUI {

    private OrderController controller;

    public OrderUI() {
        controller = new OrderController();
    }

    public void start() {
        User user = new User(1, "Ahmad", "ahmad@email.com");

        Product p1 = new Product(101, "Laptop", 2500);
        Product p2 = new Product(102, "Mouse", 100);

        Order order = controller.createOrder(1, user);

        controller.addProductToOrder(order, p1);
        controller.addProductToOrder(order, p2);

        System.out.println("Total Order Price: " +
                controller.getOrderTotal(order));
    }
}
