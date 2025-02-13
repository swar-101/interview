package example.mortalkombat.fighter.registry;

import example.mortalkombat.fighter.Fighter;

import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {
    // Map to hold Characters in a registry using String as a key identifier.
    Map<String, Fighter> registry = new HashMap<>();

    // Register a prototype in registry
    public void registerPrototype(String key, Fighter fighter) {
        registry.put(key, fighter);
    }

    public Fighter getPrototype(String key) throws CloneNotSupportedException {
        Fighter fighterPrototype = registry.get(key);
        if (fighterPrototype != null) {
            return fighterPrototype.clone();
        }
        return null;
    }
}
