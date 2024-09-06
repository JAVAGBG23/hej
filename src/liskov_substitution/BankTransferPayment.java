package liskov_substitution;

public class BankTransferPayment implements Payment{
    private String accountNumber;
    private double amount;

    public BankTransferPayment(double amount, String accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    @Override
    public void processPayment() {
        System.out.println("Process bank transfer " + amount );
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
