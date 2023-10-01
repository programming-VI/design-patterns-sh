package org.design.patterns.prototype;

public class ExamplePrototype {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3, "yellow");
        Shape copyRectangle = rectangle.clone();

        System.out.println(rectangle.color);
        System.out.println(copyRectangle.color);
        System.out.println(rectangle !=copyRectangle);
    }
}
