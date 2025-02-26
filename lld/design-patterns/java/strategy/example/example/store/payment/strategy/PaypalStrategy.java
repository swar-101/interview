package example.store.payment.strategy;

import example.store.payment.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $ " + amount + " using Paypal.");
    }
}