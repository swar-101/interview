package example.store.shopping.cart;

import example.store.payment.PaymentStrategy;
import example.store.shopping.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }


    public int calculateTotal() {
        int sum = 0;
        for (Item item: items) {
            sum = sum + item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy strategy) {
        int amount = calculateTotal();
        strategy.pay(amount);
    }
}