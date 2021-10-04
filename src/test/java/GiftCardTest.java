import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard("Tesco", 80.00);
    }

    @Test
    public void giftCardHasVendor(){
        assertEquals("Tesco", giftCard.getVendor());
    }

    @Test
    public void giftCardHasLimit(){
        assertEquals(80.00, giftCard.getBalance(), 0.01);
    }

    @Test
    public void transactionFeeIsZero(){
        assertEquals(0, giftCard.transactionFee());
    }

    @Test
    public void balanceShouldBeUpdatedWhenChargeOccurs(){
        giftCard.charge(10.00);
        assertEquals(70.00, giftCard.getBalance(), 0.01);
    }
}
