package example.mortalKombat.character.prototype.usingCloneable;

import example.mortalKombat.character.MortalKombatCharacter;

public class MortalKombatCharacterCloner extends MortalKombatCharacter implements Cloneable {

    private int health;
    private String name;
    private String[][] comboMoves;
    private String[] specialMoves;

    @Override
    public MortalKombatCharacter clone() {
            MortalKombatCharacterCloner clone = (MortalKombatCharacterCloner) super.clone();
            clone.comboMoves = comboMoves.clone();
            clone.specialMoves = specialMoves.clone();
            return clone;
    }
}