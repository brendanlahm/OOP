import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Instantiate the Fibonacci Sequence
        FibonacciSeq fibSeq = new FibonacciSeq(8); // n = # Recursions

        // Run the method
        fibSeq.fibIT(0, 1, 1);

        // Forming an array
        String[] cars = {"\nVolvo", "BMW", "Ford", "Mazda"};
        System.out.println("\nFirst car in sequence: " + cars[0]);
    }
}
