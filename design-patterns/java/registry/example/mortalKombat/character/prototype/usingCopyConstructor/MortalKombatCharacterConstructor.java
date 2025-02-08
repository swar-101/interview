package example.mortalKombat.character.prototype.usingCopyConstructor;

import example.mortalKombat.character.MortalKombatCharacter;

import java.util.Random;

public class MortalKombatCharacterConstructor extends MortalKombatCharacter implements Cloneable {

    private String weapon; // Unique field for this class

    public MortalKombatCharacterConstructor(String name, int health, int strength, String characterId, String weapon) {
        super(name, health, strength, characterId);
        this.weapon = weapon;
    }


    // Copy Constructor
    public MortalKombatCharacterConstructor(MortalKombatCharacterConstructor target) {
        super(target.name, target.health, target.strength, target.characterId); // Test can't final field Character ID

        this.weapon = target.weapon;
        this.comboMoves = target.comboMoves; // test 2D array cloning
        this.rival = target.rival != null ? (MortalKombatCharacterConstructor) target.rival : null; // test circular reference risk
        this.sessionId = new Random().nextInt(1000); // test transient fields are copied properly
    }


    @Override
    public MortalKombatCharacter clone() {
        return new MortalKombatCharacterConstructor(this);
    }


    @Override
    public String toString() {
        return name + " spawned " + " with " + weapon
                + " | Health: " + health
                + " | Strength: " + strength
                + " | Session ID: " + sessionId;
    }
}