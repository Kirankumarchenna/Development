import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    private static Calculator calc = new Calculator();

    @Test
    public void testName(){
            String ActualValue = calc.Name("Kiran Kumar chenna");
            String ExpectedValue = "Kiran Kumar chenna";
            assertEquals(ExpectedValue, ActualValue);
    }
    @Test
    public void testAdd(){
        Integer ActualValue = calc.add(12,12);
        Integer ExpectedValue = 24;
        assertEquals(ExpectedValue, ActualValue);
    }
    @Test
    public void testSubstraction(){
        Integer ActualValue = calc.Substact(30,15);
        Integer ExpectedValue = 15;
        assertEquals(ExpectedValue, ActualValue);
    }
    @Test
    public void testMultiply(){
        Integer ActualValue = calc.Multiply(5,2);
        Integer ExpectedValue = 10;
        assertEquals(ExpectedValue, ActualValue);
    }
}
