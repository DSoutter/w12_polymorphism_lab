import java.util.ArrayList;

public class OnlineAccount {

    private String name;
    private ArrayList<PaymentCard> paymentMethods;
    private ArrayList<Double> transactionFees;


    public OnlineAccount(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
