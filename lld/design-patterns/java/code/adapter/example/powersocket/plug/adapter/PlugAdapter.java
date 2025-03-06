package powersocket.plug.adapter;

import powersocket.PowerSocket;
import powersocket.plug.EuropeanPlug;

public class PlugAdapter implements PowerSocket {

    private EuropeanPlug europeanPlug;

    public PlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void providePower() throws InterruptedException {
        europeanPlug.supply220V();
        System.out.println("Converting 220V to 110V");
        Thread.sleep(10);
        System.out.println("Converted 220V to 110V successfully");
        System.out.println("Providing 110V to the laptop");
    }
}