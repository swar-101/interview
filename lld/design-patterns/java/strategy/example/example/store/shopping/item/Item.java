package example.store.shopping.item;

public class Item {
    private String id;
    private int price;

    public Item(String id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}