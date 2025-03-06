package forest;

import forest.tree.Tree;
import forest.tree.factory.TreeFactory;
import forest.tree.type.TreeType;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree: trees) {
            tree.draw();
        }
    }

    public int getTreeTypeCount() {
        return  TreeFactory.treeTypes.size();
    }
}
