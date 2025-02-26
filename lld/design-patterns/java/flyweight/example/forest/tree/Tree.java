package forest.tree;

import forest.tree.type.TreeType;

public class Tree {

    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        // Pass extrinsic field to the flyweight object.
        treeType.draw(x, y);
    }
}