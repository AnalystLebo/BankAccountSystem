package bankaccountsystem;

public class ChequeAccount extends BankAccount {

    // ChequeAccount specific field
    private double overdraftLimit;

    // Constructor
    public ChequeAccount(String accountNumber, String accountHolder,
                         double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance); // Calls BankAccount constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Different withdraw behaviour to SavingsAccount - Polymorphism!
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > getBalance() + overdraftLimit) {
            System.out.printf("Exceeds overdraft limit of R%.2f%n", overdraftLimit);
        } else {
            setBalance(getBalance() - amount);
            System.out.printf("Withdrawn R%.2f | New balance: R%.2f%n", amount, getBalance());
            if (getBalance() < 0) {
                System.out.printf("Warning: You are R%.2f into your overdraft.%n", Math.abs(getBalance()));
            }
        }
    }

    @Override
    public String getAccountType() {
        return "Cheque Account";
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void printAccountSummary() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Type:    " + getAccountType());
        System.out.println("Number:  " + getAccountNumber());
        System.out.println("Holder:  " + getAccountHolder());
        System.out.printf("Balance: R%.2f%n", getBalance());
        System.out.printf("Overdraft Limit: R%.2f%n", overdraftLimit);
        System.out.println("-----------------------");
    }
}
