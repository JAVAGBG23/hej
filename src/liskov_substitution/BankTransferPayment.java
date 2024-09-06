package liskov_substitution;

public class BankTransferPayment extends Payment{
    private String accountNumber;

    public BankTransferPayment(double amount, String accountNumber) {
        super(amount);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void processPayment() {
        // banköverföring kan kräva extra validering..
        if (amount > 1000) {
            throw new UnsupportedOperationException("Bank transfers cannot exceed $1000");
        }
        System.out.println("Processing bank transfer payment of amount: " + amount + " with account number: " + accountNumber);
    }
}
