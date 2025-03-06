package shape.factory;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}