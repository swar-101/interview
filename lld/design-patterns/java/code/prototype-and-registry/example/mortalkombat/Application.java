package mortalkombat;

import mortalkombat.fighter.Fighter;
import mortalkombat.fighter.Scorpion;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scorpion scorpion = new Scorpion();
        Fighter scorpionClone = scorpion.clone();

        System.out.println(scorpionClone.toString());
    }
}