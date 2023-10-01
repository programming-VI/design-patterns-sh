package org.design.patterns.visitor;

public class Circle implements Shape {

    private long radio;

    public Circle(long radio) {
        this.radio = radio;
    }

    @Override
    public void move(long x, long y) {

    }

    @Override
    public long calculateArea(Visitor visitor) {
        return visitor.calculateAreaCircle(this);
    }

    public long getRadio() {
        return radio;
    }
}
