package mortalkombat.fighter;

import java.util.List;

import static mortalkombat.fighter.constant.Names.LIU_KANG;
import static mortalkombat.fighter.constant.Weapons.DRAGON_FIST;

public class LiuKang extends Fighter {

    public LiuKang() {
        this.name = LIU_KANG;
        this.strength = 90;
        this.weapon = DRAGON_FIST;
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
                {"LP", "LP", "HP", "HK"},   // Bicycle Kick Combo
                {"LP", "HP", "Down + LP"},   // Dragon Kick Combo
                {"HK", "HP", "LP"}           // Fire Dragon Combo
        };
    }

    private List<String> initializeAbilities() {
        return List.of("Dragon Spirit", "Fire Mastery");
    }

    private String[] initializeSpecialMoves() {
        return new String[]{
                "Bicycle Kick (Back, Back, LP)",
                "Dragon Fire (Down, Forward, HP)",
                "Flying Kick (Up, Down, LP)"
        };
    }
}
