public class GiftCard {

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

    public int transactionFee(){
        return 0;
    }

    public void charge(Double purchaseAmount) {
        this.balance-=purchaseAmount;
    }
}
