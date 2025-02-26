import forest.Forest;

public class Application {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(23, 28, "Pine", "Purple", "Smooth");
        forest.plantTree(30, 35, "Sakura", "Pink", "Smooth");
        forest.plantTree(40, 57, "Oak", "Green", "Rough");
        forest.plantTree(70, 59, "Pine", "Orange", "Smooth");

        forest.draw();
        System.out.println("Unique Tree Types created: " + forest.getTreeTypeCount());
    }
}