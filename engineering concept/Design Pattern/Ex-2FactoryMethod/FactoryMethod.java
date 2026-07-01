abstract class Vehicle {

    abstract void start();
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car is Starting");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike is Starting");
    }
}

class VehicleFactory {

    Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        }

        if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        return null;
    }
}

public class FactoryMethod {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("Car");
        v1.start();

        Vehicle v2 = factory.getVehicle("Bike");
        v2.start();
    }
}