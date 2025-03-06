package mortalkombat.fighter;

import java.util.List;
import static mortalkombat.fighter.constant.Names.NOOB_SAIBOT;
import static mortalkombat.fighter.constant.Weapons.DARK_SHURIKEN;

public class NoobSaibot extends Fighter {

    public NoobSaibot() {
        this.name = NOOB_SAIBOT;
        this.strength = 85;  // Set according to your design
        this.weapon = DARK_SHURIKEN;
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
                {"LP", "HP", "Back + LP", "HK"},  // Shadow Strike Combo
                {"LP", "LP", "HK", "Back + HP"},    // Dark Combo
                {"HP", "HP", "LK"}                  // Phantom Attack Combo
        };
    }

    private List<String> initializeAbilities() {
        return List.of("Shadow Manipulation", "Dark Teleportation");
    }

    private String[] initializeSpecialMoves() {
        return new String[]{
                "Shadow Clone (Back, Back, LP)",
                "Dark Slash (Down, Back, HP)",
                "Phantom Strike (Forward, HP)"
        };
    }
}