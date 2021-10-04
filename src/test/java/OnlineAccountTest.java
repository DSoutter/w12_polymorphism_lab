import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {
    OnlineAccount onlineAccount;
    CreditCard paymentCard1;
    GiftCard paymentCard2;

    @Before
    public void before(){
        onlineAccount = new OnlineAccount("Jim");
        paymentCard1 = new CreditCard("Visa", 4321, "07/2023", 400.00, 0.02);
        paymentCard2 = new GiftCard("Tesco", 80.00);

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

    @Test
    public void paymentMethodsCanHaveMultiplePaymentMethods(){
        onlineAccount.addPaymentMethod(paymentCard1);
        onlineAccount.addPaymentMethod(paymentCard2);
        assertEquals(2, onlineAccount.getPaymentMethods().size());
    }

    @Test
    public void chargeAddsToArrayListOfCustomer(){
        onlineAccount.chargeCustomer(paymentCard1, 40.00);
        assertEquals(1, onlineAccount.getTransactionFees().size());
    }
}
