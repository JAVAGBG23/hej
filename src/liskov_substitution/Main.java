package liskov_substitution;

public class Main {
    public static void main(String[] args) {

            Payment creditCardPayment = new CreditCardPayment(500, "1234-5678-9876");
            creditCardPayment.processPayment();

            Payment bankTransferPayment = new BankTransferPayment(1500, "ACC-12345");
            bankTransferPayment.processPayment();

    }
}
