import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import com.java.Mocking.UserDao;
import com.java.Mocking.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    @Test
    public void getNameById(){
        UserDao MockDao = PowerMockito.mock(UserDao.class);
        PowerMockito.when(MockDao.findNameById(101)).thenReturn("Kiran");

        UserService userService = new UserService();
        String name = userService.getNameByUserId(101);
        assertEquals("Kiran", name);
    }
}
