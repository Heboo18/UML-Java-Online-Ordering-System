package entity;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private User customer;
    private List<Product> products;

    public Order(int orderId, User customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }
}
