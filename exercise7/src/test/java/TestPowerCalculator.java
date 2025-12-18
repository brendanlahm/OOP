import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPowerCalculator {

    private static PowerCalculation calculation = new PowerCalculation();

    @Test
    public void testEqualsValue() {
        Assertions.assertEquals(8, calculation.powerRC(2,3), 0.001);
    }

    @Test
    public void testNotValue() {
        Assertions.assertNotEquals(9, calculation.powerRC(2,3), 0.001);
    }

    @Test
    public void testNotZero() {
        Assertions.assertTrue(calculation.powerRC(2,-300) > 0 || calculation.powerRC(2,-300) < 0);
    }

    @Test
    public void testNotNegative() {
        Assertions.assertTrue(calculation.powerRC(2,-300) >= 0);
    }

    @Test
    public void testAtLeastOne() {
        Assertions.assertTrue(calculation.powerRC(2,0) >= 1);
    }
    
}
