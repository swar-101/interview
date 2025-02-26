package example.store;

import example.store.payment.PaymentStrategy;
import example.store.payment.strategy.CreditCardStrategy;
import example.store.payment.strategy.PaypalStrategy;
import example.store.shopping.cart.ShoppingCart;
import example.store.shopping.item.Item;

public class Store {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1234", 100));
        cart.addItem(new Item("3242", 345));

        PaymentStrategy creditCardStrategy = new CreditCardStrategy("John Doe", "1234 5324 1234 5342", "342", "12/27");
        cart.pay(creditCardStrategy);

        PaymentStrategy paypalStrategy = new PaypalStrategy("john.doe@example.com", "test123");
        cart.pay(paypalStrategy);
    }
}