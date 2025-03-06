package pizza;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .setDough("Thin Crust")
                .setSauce("Tomato Basil")
                .setCheese("Mozzarella")
                .setTopping("Pepperoni").build();

        System.out.println(pizza.toString());
    }
}
