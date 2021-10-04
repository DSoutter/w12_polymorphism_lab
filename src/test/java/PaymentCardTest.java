import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentCardTest {
    PaymentCard paymentCard;

    @Before
    public void before(){
        paymentCard = new DebitCard("Revolut", 1234, "06/2023", "80-45-90", "01083322");
    }

    @Test
    public void cardHasName(){
        assertEquals("Revolut",paymentCard.getCardName());
    }

    @Test
    public void cardHasSecurityNumber(){
        assertEquals(1234,paymentCard.getSecurityNumber());
    }

    @Test
    public void cardHasExpiryDate(){
        assertEquals("06/2023",paymentCard.getExpiryDate());
    }

    @Test
    public void cardHasChargesArrayListOfZero(){
        assertEquals(0,paymentCard.getCharges().size());
    }

    @Test
    public void cardCanAddACharge(){
        paymentCard.addCharge(15.00);
        assertEquals(1,paymentCard.getCharges().size());
    }



}
