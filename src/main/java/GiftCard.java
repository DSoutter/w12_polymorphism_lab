public class GiftCard implements IChargeable{

    private String vendor;
    private Double balance;

    public GiftCard(String vendor, Double balance) {
        this.vendor = vendor;
        this.balance = balance;
    }

    public String getVendor() {
        return vendor;
    }

    public Double getBalance() {
        return balance;
    }


    public double getTransactionFee(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {
        this.balance-=purchaseAmount;

    }
}
