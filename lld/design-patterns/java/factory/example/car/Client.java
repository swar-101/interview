package car;

import car.factory.CarFactory;

public class Client {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car sedan = factory.getCar("sedan");
        sedan.drive();

        Car suv = factory.getCar("SUV");
        suv.drive();
    }
}
