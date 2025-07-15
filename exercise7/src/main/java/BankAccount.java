public class BankAccount {

    // Private attributes
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) { this.balance = initialBalance; }

    // Method for depositing a double amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method for withdrawing a double amount
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount (" + amount + ") exceeds your balance! " + balance);
        }
    }

    // Getter for bank account balance
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

}
