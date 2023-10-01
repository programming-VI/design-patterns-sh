package org.design.patterns.visitor;

public class Rectangle implements Shape {

    private long a, b;

    public Rectangle(long a, long b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void move(long x, long y) {

    }

    @Override
    public long calculateArea(Visitor visitor) {
        return visitor.calculateAreaRectangle(this);
    }

    public long getA() {
        return a;
    }

    public long getB() {
        return b;
    }
}
