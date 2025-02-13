package example.mortalkombat.fighter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static example.mortalkombat.config.Random.*;

public class Fighter implements Cloneable {
    protected String characterId;
    protected String name;
    protected int health = 100;
    protected int strength;
    protected String[][] comboMoves; // "a shallow copy is enough, comboMoves are standardized controls
    protected String[] specialMoves;
    protected String weapon;

    // Test attributes
    protected Fighter rival;  // Circular reference
    protected List<String> abilities;       // Immutable collection
    protected transient int sessionId;      // Transient field

    public Fighter() {
    }

    public Fighter(String name, int strength, String characterId) {
        this.name = name;
        this.strength = strength;
        this.characterId = characterId;
        this.sessionId = new Random().nextInt();
    }

    @Override
    public Fighter clone() throws CloneNotSupportedException {
        Fighter cloned = new Fighter();
        cloned = (Fighter) super.clone(); // Step 1: Create a shallow copy using clone() and Type Casting.

        cloned.sessionId = globalRandom.nextInt();

        // Deep copy of mutable fields if necessary
        if (this.comboMoves != null) {
            cloned.comboMoves = this.comboMoves.clone();
        }
        if (this.specialMoves != null) {
            cloned.specialMoves = this.specialMoves.clone();
        }

        return cloned;
    }

    @Override
    public String toString() {
        return name + " spawned with the " + weapon
                + "\n | Character ID: " + characterId
                + "\n | Health: " + health
                + "\n | Strength: " + strength
                + "\n | Abilities: " + abilities
                + "\n | Session ID: " + sessionId
                + "\n | ComboMovesAvailable: " + Arrays.deepToString(comboMoves)
                + "\n | SpecialMovesAvailable: " + Arrays.toString(specialMoves)
                + "\n | Rival: " + rival + "\n";
    }
}