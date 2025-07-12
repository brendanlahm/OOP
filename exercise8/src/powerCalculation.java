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

}
