package example.mortalkombat;

import example.mortalkombat.fighter.Fighter;
import example.mortalkombat.fighter.Scorpion;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scorpion scorpion = new Scorpion();
        Fighter scorpionClone = scorpion.clone();

        System.out.println(scorpionClone.toString());
    }
}