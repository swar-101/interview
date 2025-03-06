package car.factory;

import car.Car;
import car.SUV;
import car.Sedan;

public class CarFactory {
    public Car getCar(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("SEDAN")) {
            return new Sedan();
        } else if (type.equalsIgnoreCase("SUV")) {
            return new SUV();
        }
        return null;
    }
}
