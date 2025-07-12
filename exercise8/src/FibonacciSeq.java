public class FibonacciSeq {

    // Private Attributes
    int n;

    // Constructor
    public FibonacciSeq(int n) {
        this.n = n;
    }

    // Recursive sequence
    public int fibIT(int x, int y, int z) {
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        System.out.println("Fibonacci Numbers:\n" + "x=" + x + ", y=" + y + ", z=" + z);
        return x;
    }

}
