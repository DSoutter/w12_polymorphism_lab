import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {
    OnlineAccount onlineAccount;

    @Before
    public void before(){
        onlineAccount = new OnlineAccount("Jim");
    }

    @Test
    public void accountHasName(){
        assertEquals("Jim", onlineAccount.getName());
    }
}
