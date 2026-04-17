package bankaccountsystem;

public abstract class BankAccount {

    // Encapsulation - private fields
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Concrete methods - shared by ALL account types
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited R%.2f | New balance: R%.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Getters - Encapsulation
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance()        { return balance; }

    // Protected setter - only child classes can adjust balance
    protected void setBalance(double balance) { this.balance = balance; }

    // Abstract methods - every child class MUST implement these
    public abstract void withdraw(double amount);
    public abstract String getAccountType();
    public abstract void printAccountSummary();
}