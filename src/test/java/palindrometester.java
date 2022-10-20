import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class palindrometester {
    @Test
    public void palindrometest(){
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        Long start = System.currentTimeMillis();

        Palindrome palindrome = new Palindrome();
        Boolean ActualOutput = palindrome.palindromecheck("kiran");
        Boolean ExpectedOutput = true;
        assertSame(ExpectedOutput, ActualOutput);

        Long end = System.currentTimeMillis();
        System.out.println("Current time is: "+ localTime+ "\nToday's Date is: "+ localDate);
        System.out.println("Time take to run the program: "+ (end - start)+" Millisecond");
    }
    @ParameterizedTest
    @ValueSource(strings = {"radar", "kiik", "racecar", "madam", "liril"})
    public void palindromeTest1(String input) {
        Palindrome palindrome = new Palindrome();
        Boolean ActualInput = palindrome.palindromecheck(input);
        assertTrue(ActualInput);
    }
}
