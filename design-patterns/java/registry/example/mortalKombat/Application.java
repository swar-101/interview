package example.mortalKombat;

import example.mortalKombat.character.MortalKombatCharacter;
import example.mortalKombat.character.Scorpion;

public class Application {
    public static void main(String[] args) {
        MortalKombatCharacter scorpion = new Scorpion();
        MortalKombatCharacter clonedScorpion = scorpion.clone();

        MortalKombatCharacter copiedScorpion = scorpion.clone();

    }
}
