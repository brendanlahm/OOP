public class Main {

    public static void main(String[] args) {

        // Instantiate the Prime # Analyzer
        System.out.println("This is the Prime # Analyzer.");
        PrimeAnalyzer primeAnalyzer = new PrimeAnalyzer();
        boolean result = primeAnalyzer.isPrime(17);
        System.out.println("Is 17 a prime #?\n" + result);

    }

}
