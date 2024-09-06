package liskov_substitution;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private double amount;

    public CreditCardPayment(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }


    @Override
    public void processPayment() {
        System.out.println("Processing payment for credit card " + amount + " card number: " + cardNumber);
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
