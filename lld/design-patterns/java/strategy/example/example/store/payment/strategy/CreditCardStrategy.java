package example.store.payment.strategy;

import example.store.payment.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNo;
    private String cvv;
    private String expDate;

    public CreditCardStrategy(String name, String cardNo, String cvv, String expDate) {
        this.name = name;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $ " + amount + " using a Credit Card.");
    }
}