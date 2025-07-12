public class powerCalculation {

    // Private attribute
    int a;

    // Constructor
    public powerCalculation(int a) {
        this.a = a;
    }

    // Iterative method
    public int power(int n){
        for (int i = 0; i < a; i++) {
            System.out.println("\ny = " + Math.pow(a, n));
        }
        return n;
    }

    // Recursive method
    public double powerRC(double n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            System.out.println("\nn = " + n);
            return a * powerRC(n - 1);
        } else {
            // For negative powers: a^(-n) = 1 / a^n
            System.out.println("\nn = " + n);
            return 1 / powerRC(-n);
        }
    }
}
