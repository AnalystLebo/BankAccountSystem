package bankaccountsystem;

public class Main {

    public static void main(String[] args) {

        // Creating a SavingsAccount object
        SavingsAccount savings = new SavingsAccount(
                "SA-001", "Lebohang Tapeane", 5000.00, 5.0);

        // Creating a ChequeAccount object
        ChequeAccount cheque = new ChequeAccount(
                "CA-001", "Lebohang Tapeane", 3000.00, 1000.00);

        // --- Test SavingsAccount ---
        System.out.println("========== SAVINGS ACCOUNT ==========");
        savings.printAccountSummary();

        savings.deposit(1000.00);
        savings.withdraw(500.00);
        savings.applyInterest();
        savings.withdraw(99999.00); // Should show insufficient funds

        savings.printAccountSummary();

        // --- Test ChequeAccount ---
        System.out.println("\n========== CHEQUE ACCOUNT ==========");
        cheque.printAccountSummary();

        cheque.deposit(500.00);
        cheque.withdraw(3000.00); // Goes into overdraft
        cheque.withdraw(99999.00); // Should exceed overdraft limit

        cheque.printAccountSummary();

        // --- Polymorphism in action ---
        System.out.println("\n========== POLYMORPHISM DEMO ==========");
        BankAccount[] accounts = {savings, cheque};

        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountHolder() +
                    " has a " + acc.getAccountType() +
                    " with balance R" + acc.getBalance());
        }
    }
}