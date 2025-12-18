import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPowerCalculator {

    private static PowerCalculation calculation = new PowerCalculation();

    @Test
    public void testPowerCalculator() {

        Assertions.assertEquals(8, calculation.powerRC(2,3), 0.001);

    }

}
