package example.mortalKombat.character;

import example.mortalKombat.character.constant.Abilities;
import example.mortalKombat.character.constant.Moves;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class MortalKombatCharacter {
    protected String characterId;
    protected String name;
    protected int health;
    protected int strength;
    protected String[][] comboMoves;
    protected MortalKombatCharacter rival;  // Circular reference
    protected List<String> abilities;       // Immutable collection
    protected transient int sessionId;      // Transient field

    public MortalKombatCharacter() {
    }

    protected MortalKombatCharacter(String name, int health, int strength, String characterId) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.characterId = characterId;
        this.comboMoves = initializeComboMoves(this.name);
        this.abilities = initializeAbilities(this.name);
        this.sessionId = new Random().nextInt();
    }

    private List<String> initializeAbilities(String characterName) {
        return List.of(Abilities.SHADOW_KICK, Abilities.TELEPORT);
    }

    private String[][] initializeComboMoves(String characterName) {
        return new String[][]{{Moves.PUNCH, Moves.KICK}, {Moves.BLOCK, Moves.FIREBALL}};
    }

    public MortalKombatCharacter clone() {
        try {
            MortalKombatCharacter clone = (MortalKombatCharacter) super.clone();
            if (this.comboMoves != null) {
                clone.comboMoves = Arrays.stream(this.comboMoves).map(String[]::clone).toArray(String[][]::new);
            }
            clone.rival = null;  // Setting this to prevent deep recursion issues
            clone.sessionId = new Random().nextInt(); // Transient field, resetting instead of cloning

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }
}