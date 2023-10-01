package org.design.patterns.visitor;

public interface Shape {
    void move(long x, long y);
    long calculateArea(Visitor visitor);
}
