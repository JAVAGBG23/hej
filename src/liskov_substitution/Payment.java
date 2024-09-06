package liskov_substitution;

public class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void processPayment() {
        // här kan t.ex. allmän betalningslogik ligga
        System.out.println("Processing payment of amount: " + amount);
    }
}
