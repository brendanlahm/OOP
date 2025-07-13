public class Main {
    public static void main(String[] args) {

        // Instantiate the Fibonacci Sequence
        FibonacciSeq fibSeq = new FibonacciSeq(3); // n = # Iterations
        fibSeq.fibIT(0, 1, 1); // Run the iterative method

        // Recursive method
//        FibonacciSeq recSeq = new FibonacciSeq(3);
//        recSeq.fibRC(34);

        // Instantiate the Power Algorithm
//        powerCalculation powCalc = new powerCalculation();
//        powCalc.power(3, 2); // Run the calculation

        // Recursive method
        powerCalculation recCalc = new powerCalculation(); //
        recCalc.powerRC(5, 6); // Run the calculation

        // Forming an array
        String[] cars = {"\nVolvo", "BMW", "Ford", "Mazda"};
        System.out.println("\nFirst car in sequence: " + cars[0]);
    }
}
