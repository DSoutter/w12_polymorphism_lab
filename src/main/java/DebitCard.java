public class DebitCard extends PaymentCard implements IChargeable{

    private String sortCode;
    private String accountNumber;

    public DebitCard(String cardName, int securityNumber, String expiryDate, String sortCode, String accountNumber) {
        super(cardName, securityNumber, expiryDate);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getTransactionFee(double purchaseAmount){
        return purchaseAmount*0.02;
    }

    public void charge(double purchaseAmount){
        this.addCharge(purchaseAmount);
    }
}
