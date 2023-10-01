package org.design.patterns.factory.vehicle;

import org.design.patterns.factory.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bike accelerating");
    }
}
