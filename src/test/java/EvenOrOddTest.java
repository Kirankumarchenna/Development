import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {
    @ParameterizedTest
    @CsvFileSource(resources = "Data.csv", numLinesToSkip =1)  //Inputs from CSV File Source
    public void evenOrOdd(String Input, String Expected){
        Even even = new Even();
        String Actual = even.Identifier(Integer.valueOf(Input));
        assertEquals(Expected, Actual);
    }
}