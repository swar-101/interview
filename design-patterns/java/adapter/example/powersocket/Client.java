package powersocket;

import powersocket.plug.EuropeanPlug;
import powersocket.plug.adapter.PlugAdapter;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of EuropeanPlug, which supplies 220V power.
        EuropeanPlug europeanPlug = new EuropeanPlug();

        // Using a PlugAdapter to make the EuropeanPlug compatible with PowerSocket.
        // The PlugAdapter converts 220V to 110V, making it suitable for devices expecting 100V.
        PowerSocket adapter = new PlugAdapter(europeanPlug);

        // The adapter ensures that correct voltage is provided.
        adapter.providePower();
    }
}