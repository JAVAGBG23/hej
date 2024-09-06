package liskov_substitution;

public interface Payment {
    void processPayment();
        // här kan t.ex. allmän betalningslogik ligga
       // System.out.println("Processing payment of amount: " + amount);
    double getAmount();
}
