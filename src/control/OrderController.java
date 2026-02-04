package control;

import entity.Order;
import entity.Product;
import entity.User;

public class OrderController {

    public Order createOrder(int orderId, User user) {
        return new Order(orderId, user);
    }

    public void addProductToOrder(Order order, Product product) {
        order.addProduct(product);
    }

    public double getOrderTotal(Order order) {
        return order.calculateTotal();
    }
}
