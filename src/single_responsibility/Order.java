package single_responsibility;

import java.util.List;

public class Order {
    private int orderId;
    private List<String> items;
    private double totalAmount;

    public Order(int orderId, List<String> items, double totalAmount) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void processPayment(String paymentMethod) {
        // här skulle betalningslogik, t.ex. kort eller PayPal finnas
        System.out.println("Processing payment of " + totalAmount + " using " + paymentMethod);
    }

    public void generateInvoice() {
        System.out.println("Invoice for Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Amount: " + totalAmount);
    }

    public void shipOrder() {
        System.out.println("Shipping order with ID: " + orderId);
    }
}
