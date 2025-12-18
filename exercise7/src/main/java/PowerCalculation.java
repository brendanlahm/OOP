public class PowerCalculation {

    // Iterative method
    public int power(double a, int n){
        for (int i = 0; i < a; i++) {
            System.out.println("\ny = " + Math.pow(a, n));
        }
        return n;
    }

    // Recursive method
    public double powerRC(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) { // Positive powers
            return a * powerRC(a, n - 1);
        } else { // For negative powers: a^(-n) = 1 / a^n
            return 1 / powerRC(a, -n);
        }
    }

}
