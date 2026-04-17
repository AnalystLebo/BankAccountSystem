# Bank Account System

A Java console application that simulates a basic banking system. Built to demonstrate all four core Object-Oriented Programming (OOP) principles: Encapsulation, Inheritance, Polymorphism, and Abstraction.

## OOP Concepts Demonstrated

- **Encapsulation** — Account fields like `balance` are private and only accessible through controlled getter and setter methods
- **Inheritance** — `SavingsAccount` and `ChequeAccount` both extend the abstract `BankAccount` class, inheriting shared behaviour
- **Polymorphism** — Both account types override `withdraw()` and `getAccountType()` with their own behaviour
- **Abstraction** — `BankAccount` is an abstract class that acts as a template, forcing all child classes to implement key methods

## Project Structure

```
BankAccountSystem
└── src
    └── bankaccountsystem
        ├── BankAccount.java        # Abstract parent class
        ├── SavingsAccount.java     # Child class with interest rate
        ├── ChequeAccount.java      # Child class with overdraft limit
        └── Main.java               # Runs and demonstrates the system
```

## Features

- Create Savings and Cheque accounts with opening balances
- Deposit funds into any account
- Withdraw funds with account-specific rules:
  - Savings Account blocks withdrawals exceeding the balance
  - Cheque Account allows withdrawals into overdraft up to a set limit
- Apply interest to Savings Accounts
- Print a full account summary for any account
- Polymorphism demo — loop through multiple account types with a single method call

## Technologies Used

- Java (JDK 8+)
- NetBeans IDE

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/AnalystLebo/BankAccountSystem.git
   ```
2. Open the project in NetBeans (or any Java IDE).
3. Right click `Main.java` and select **Run File**.

## Example Output

```
========== SAVINGS ACCOUNT ==========

--- Account Summary ---
Type:    Savings Account
Number:  SA-001
Holder:  Lebohang Tapeane
Balance: R5000.00
Interest Rate: 5.0%
-----------------------

Deposited R1000.00 | New balance: R6000.00
Withdrawn R500.00 | New balance: R5500.00
Deposited R275.00 | New balance: R5775.00
Interest of 5.0% applied.
Insufficient funds.

========== CHEQUE ACCOUNT ==========

--- Account Summary ---
Type:    Cheque Account
Number:  CA-001
Holder:  Lebohang Tapeane
Balance: R3000.00
Overdraft Limit: R1000.00
-----------------------

Deposited R500.00 | New balance: R3500.00
Withdrawn R3000.00 | New balance: R500.00
Warning: You are R500.00 into your overdraft.
Exceeds overdraft limit of R1000.00

========== POLYMORPHISM DEMO ==========
Lebohang Tapeane has a Savings Account with balance R5775.0
Lebohang Tapeane has a Cheque Account with balance R500.0
```

## Purpose

Built to strengthen understanding of Object-Oriented Programming in Java, directly applicable to Junior Java Developer roles. Demonstrates clean class design, method overriding, and real-world modelling of a banking system.

## License

MIT License — feel free to use and build on this project.
