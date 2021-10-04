import java.util.ArrayList;

public abstract class PaymentCard{

    private String cardName;
    private int securityNumber;
    private String expiryDate;
    private ArrayList<Double> charges;

    public PaymentCard(String cardName, int  securityNumber, String expiryDate) {
        this.cardName = cardName;
        this.securityNumber = securityNumber;
        this.expiryDate = expiryDate;
        this.charges = new ArrayList<>();
    }

    public String getCardName() {
        return cardName;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public void addCharge(Double charge) {
        this.charges.add(charge);
    }


}
