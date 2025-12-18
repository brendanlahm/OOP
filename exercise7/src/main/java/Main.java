public class Main {

    public static void main(String[] args) {

        // Power Calculation
        // Instantiate the calculator
        PowerCalculation powerCalc = new PowerCalculation();
        //powerCalc.powerRC(2,3);
        System.out.println("\nPower calculation answer: " + powerCalc.powerRC(2,3)); // a: double, n: int

        // Prime # Analyzer
        // Instantiate the Prime # Analyzer
        System.out.println("\nThis is the Prime # Analyzer.");
        PrimeAnalyzer primeAnalyzer = new PrimeAnalyzer();

        // Is 17 a prime #?
        boolean result = primeAnalyzer.isPrime(17);
        System.out.println("Is 17 a prime #?\n" + result + "\n");

        // Bank Account
        //Instantiate the Bank Account
        BankAccount bank = new BankAccount(0.0);
        bank.deposit(125000.25); // Deposit $
        double balance = bank.getBalance(); // Return balance
        System.out.println("Current balance = " + balance); // Print balance

        // Withdrawal cannot exceed the balance
        bank.withdraw(125000.26); // Withdraw $
        balance = bank.getBalance(); // Return balance
        System.out.println("Current balance = " + balance); // Print balance

        // Accepted withdrawal
        bank.withdraw(125000.25); // Withdraw $
        balance = bank.getBalance(); // Return balance
        System.out.println("Current balance = " + balance); // Print balance

    }

}
