import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTest {
    @Test
    public void StringTesta(){
        String st = null;
        assertThrows(IllegalArgumentException.class, ()->StringUtil.ConvertToInt(st));
    }
}
