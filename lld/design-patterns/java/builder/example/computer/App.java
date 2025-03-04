package computer;

import pizza.Pizza;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .HDD("500 TB")
                .RAM("16 GB")
                .isBluetoothEnabled(true)
                .isGraphicEnabled(false).build();

        System.out.println(computer.toString());
    }

}
