package org.design.patterns.visitor;

public class Calculator implements Visitor {
    @Override
    public long calculateAreaCircle(Circle circle) {
        return (long) (Math.pow(circle.getRadio(), 2) * Math.PI);
    }

    @Override
    public long calculateAreaRectangle(Rectangle rectangle) {
        return (long) rectangle.getA() * rectangle.getB();
    }
}
