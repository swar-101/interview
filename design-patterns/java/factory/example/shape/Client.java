package shape;

import shape.factory.ShapeFactory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}