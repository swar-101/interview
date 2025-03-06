package facade;

import appliance.AC;
import appliance.Light;
import appliance.MusicPlayer;

public class HomeFacade {
    private Light light;
    private AC ac;
    private MusicPlayer musicPlayer;

    public HomeFacade() {
        this.light = new Light();
        this.ac = new AC();
        this.musicPlayer = new MusicPlayer();
    }

    public void startMovie() {
        System.out.println("Starting movie mode...");
        light.turnOn();
        ac.turnOn();
        musicPlayer.playMusic();
    }

    public void stopMovie() {
        System.out.println("Stopping movie mode...");
        light.turnOff();
        ac.turnOff();
        musicPlayer.stopMusic();
    }
}