import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPrimeAnalyzer {

    @Test
    void testIsPrime() {

        Assertions.assertTrue(PrimeAnalyzer.isPrime(17));
        Assertions.assertFalse(PrimeAnalyzer.isPrime(18));
        Assertions.assertTrue(PrimeAnalyzer.isPrime(19));

    }

}
