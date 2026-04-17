package bankaccountsystem;

public class SavingsAccount extends BankAccount {

    // SavingsAccount specific field
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, 
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Calls BankAccount constructor
        this.interestRate = interestRate;
    }

    // Inherited from BankAccount - different behaviour
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient funds.");
        } else {
            setBalance(getBalance() - amount);
            System.out.printf("Withdrawn R%.2f | New balance: R%.2f%n", amount, getBalance());
        }
    }

    // Polymorphism - own version of getAccountType()
    @Override
    public String getAccountType() {
        return "Savings Account";
    }

    // SavingsAccount specific method
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.printf("Interest of %.1f%% applied.%n", interestRate);
    }

    @Override
    public void printAccountSummary() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Type:    " + getAccountType());
        System.out.println("Number:  " + getAccountNumber());
        System.out.println("Holder:  " + getAccountHolder());
        System.out.printf("Balance: R%.2f%n", getBalance());
        System.out.printf("Interest Rate: %.1f%%%n", interestRate);
        System.out.println("-----------------------");
    }
}