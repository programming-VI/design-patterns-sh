package org.design.patterns.visitor;

public class VisitorExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 5);
        Visitor visitor = new Calculator();
        System.out.println(visitor.calculateAreaRectangle(rectangle));
        System.out.println(visitor.calculateAreaCircle(circle));
    }
}
