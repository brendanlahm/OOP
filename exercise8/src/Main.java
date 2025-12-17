public class Main {
    public static void main(String[] args) {

        // Instantiate the Fibonacci Sequence
//        FibonacciSeq fibSeq = new FibonacciSeq(4); // n = # Iterations
//        fibSeq.fibIT(0, 1, 1); // Run the iterative method

        // Recursive method
        FibonacciSeq recSeq = new FibonacciSeq(1);
        System.out.println("Fibonacci Numbers:\n" + recSeq.fibRC(3));

        // Instantiate the Power Algorithm
//        powerCalculation powCalc = new powerCalculation();
//        powCalc.power(2, 3); // Run the calculation

        // Recursive method
        powerCalculation recCalc = new powerCalculation(); //
        //recCalc.powerRC(8, -3); // Run the calculation

        // Forming an array & printing first value
        String[] cars = {"\nVolvo", "BMW", "Ford", "Mazda"};
        //System.out.println("\nFirst car in sequence: " + cars[0]);

        // Modular Calculation: Summarizing an integer's digits
        int n = 5346;
        int total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        System.out.println("\n" + total);

        // Power calculation
        int a = 2; // Initial value
        int b = 1;
        int x = 3; // Power of a
        int count = 0;

        if (x==0) {System.out.println("\nAnswer: " + 1);}
        else {
            while (count < x) {
                b = b * a;
                count = count + 1;
            }
        }
        //System.out.println("\nAnswer: " + b);

    }
}
