package forest.tree.type;

public class ConcreteTreeType implements TreeType {
    private String name;
    private String color;
    private String texture;

    public ConcreteTreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " colored " + name
                + " tree at (" + x + ", " + y + ") "
                + "with " + texture + " texture.");
    }
}
