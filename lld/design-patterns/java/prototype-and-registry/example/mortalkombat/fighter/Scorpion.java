package example.mortalkombat.fighter;

import java.util.List;

import static example.mortalkombat.fighter.constant.Names.SCORPION;
import static example.mortalkombat.fighter.constant.Weapons.KUNAI;

public class Scorpion extends Fighter {

    public Scorpion() {
        this.name = SCORPION;
        this.strength = 92;
        this.weapon = KUNAI;
        this.comboMoves = initializeComboMoves();
        this.abilities = initializeAbilities();
        this.specialMoves = initializeSpecialMoves();
    }

    private String[][] initializeComboMoves() {
        return new String[][]{
                {"HP", "HP", "Back + HK", "LK"}, // Inferno Strike
                {"LP", "LP", "HK", "LK"},        // Hellfire Combo
                {"HP", "HP", "LK"}               // Spear Strike
        };
    }

    private List<String> initializeAbilities() {
        return List.of("Resurrection", "Hell-fire Powers");
    }

    private String[] initializeSpecialMoves() {
        return new String[]{
                "Spear (Back, Back, LP)",
                "Teleport Punch (Down, Back, HP)",
                "Fire Breath (Back, Forward, HP)"
        };
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
}