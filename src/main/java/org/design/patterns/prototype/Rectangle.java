package org.design.patterns.prototype;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public Shape clone() {
        return new Rectangle(super.x, super.y, super.color);
    }
}
