package org.design.patterns.prototype;

public class Circle extends Shape {
    public Circle(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public Shape clone() {
        return new Circle(super.x, super.y, super.color);
    }
}
