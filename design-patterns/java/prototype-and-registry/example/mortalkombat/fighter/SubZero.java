package example.mortalkombat.fighter;

import java.util.List;
import static example.mortalkombat.fighter.constant.Names.SUB_ZERO;
import static example.mortalkombat.fighter.constant.Weapons.ICE_SWORD;

public class SubZero extends Fighter {

    public SubZero() {
        this.name = SUB_ZERO;
        this.strength = 88;  // Set strength value as needed
        this.weapon = ICE_SWORD;
        this.comboMoves = initializeComboMoves();
        this.abilities = initializeAbilities();
        this.specialMoves = initializeSpecialMoves();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private String[][] initializeComboMoves() {
        return new String[][]{
                {"LP", "HP", "LP", "HK"},         // Ice Combo 1
                {"LP", "LP", "Back + HP", "HK"},    // Ice Combo 2
                {"HP", "Back + LP", "HP"}           // Frozen Combo
        };
    }

    private List<String> initializeAbilities() {
        return List.of("Ice Blast", "Frozen Aura", "Ice Clone");
    }

    private String[] initializeSpecialMoves() {
        return new String[]{
                "Ice Shatter (Back, Back, LP)",
                "Frozen Strike (Down, Back, HP)",
                "Glacial Burst (Forward, HP)"
        };
    }
}