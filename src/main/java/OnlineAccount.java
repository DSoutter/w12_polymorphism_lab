import java.util.ArrayList;

public class OnlineAccount {

    private String name;
    private ArrayList<IChargeable> paymentMethods;
    private ArrayList<Double> transactionFees;


    public OnlineAccount(String name) {
        this.name = name;
        this.paymentMethods = new ArrayList<>();
        this.transactionFees = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<IChargeable> getPaymentMethods() {
        return paymentMethods;
    }

    public ArrayList<Double> getTransactionFees() {
        return transactionFees;
    }

    public void addPaymentMethod(IChargeable paymentMethod ) {
        this.paymentMethods.add(paymentMethod);
    }

    public void chargeCustomer(IChargeable paymentCard, double transactionCost){
        paymentCard.charge(transactionCost);
        this.transactionFees.add(paymentCard.getTransactionFee(transactionCost));

    }
}
