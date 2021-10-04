public class CreditCard extends PaymentCard implements IChargeable {

    private Double creditLimit;
    private Double riskMultiplier;


    public CreditCard(String cardName, int securityNumber, String expiryDate, Double creditLimit, Double riskMultiplier) {
        super(cardName, securityNumber, expiryDate);
        this.creditLimit = creditLimit;
        this.riskMultiplier = riskMultiplier;

    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public Double getRiskMultiplier() {
        return riskMultiplier;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getTransactionFee(double purchaseAmount){
        return purchaseAmount*(2*riskMultiplier);
    }

    public void charge(double purchaseAmount){
        this.addCharge(purchaseAmount);
        this.creditLimit -= purchaseAmount;
    }
}
