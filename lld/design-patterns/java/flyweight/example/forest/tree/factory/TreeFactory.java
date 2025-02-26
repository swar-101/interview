package forest.tree.factory;

import forest.tree.type.ConcreteTreeType;
import forest.tree.type.TreeType;

import java.util.HashMap;

public class TreeFactory {
    public static HashMap<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new ConcreteTreeType(name, color, texture));
            System.out.println("Creating a new Tree Type: " + key);
        } else {
            System.out.println("Reusing existing Tree Type.");
        }
        return treeTypes.get(key);
    }
}