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

    @Test
    public void paymentMethodArrayListHasSizeZero(){
        assertEquals(0, onlineAccount.getPaymentMethods().size());
    }

    @Test
    public void transactionFeesArrayListHasSizeZero(){
        assertEquals(0, onlineAccount.getTransactionFees().size());
    }
}
