public class FibonacciSeq {

    // Private Attributes
    int n;

    // Constructor
    public FibonacciSeq(int n) {
        this.n = n;
    }

    // Iterative method
    public int fibIT(int x, int y, int z) {
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        System.out.println("Fibonacci Numbers:\n" + "x=" + x + ", y=" + y + ", z=" + z);
        return x;
    }

    // Recursive method
    public int fibRC(int x) {
        if(x == 0)
            return 0;
        if(x == 1)
            return 1;
        System.out.println("Fibonacci Numbers:\n" + x);
        return fibRC(x-1) + fibRC(x-2);
    }

}
