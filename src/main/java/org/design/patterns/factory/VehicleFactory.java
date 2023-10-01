package org.design.patterns.factory;

import org.design.patterns.factory.vehicle.Bike;
import org.design.patterns.factory.vehicle.Car;

public class VehicleFactory {
    public Vehicle createVehicle(String type) {
        return switch (type) {
            case "CAR" -> new Car();
            case "BIKE" -> new Bike();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
