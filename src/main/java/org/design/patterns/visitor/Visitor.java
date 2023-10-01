package org.design.patterns.visitor;

public interface Visitor {
    long calculateAreaCircle(Circle circle);
    long calculateAreaRectangle(Rectangle rectangle);
}
