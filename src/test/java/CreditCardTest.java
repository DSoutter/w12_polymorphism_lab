import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard("Visa", 4321, "07/2023", 400.00, 2.00);
    }

    @Test
    public void hasName(){
        assertEquals("Visa", creditCard.getCardName());
    }

    @Test
    public void hasSecurityNumber(){
        assertEquals(4321, creditCard.getSecurityNumber());
    }

    @Test
    public void hasExpirationDate(){
        assertEquals("07/2023", creditCard.getExpiryDate());
    }

    @Test
    public void hasLimit(){
        assertEquals(400.00, creditCard.getCreditLimit(),0.01);
    }

    @Test
    public void hasRiskMultiplier(){
        assertEquals(2.00, creditCard.getRiskMultiplier(),0.01);
    }
}
