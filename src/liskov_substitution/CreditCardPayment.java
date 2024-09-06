package liskov_substitution;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void processPayment() {
        // specifik logik för kreditkort
        System.out.println("Processing credit card payment of amount: " + amount + " with card number: " + cardNumber);
    }
}
