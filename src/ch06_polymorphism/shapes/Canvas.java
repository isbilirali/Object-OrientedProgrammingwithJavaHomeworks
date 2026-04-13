package ch06_polymorphism.shapes;

import ch06_polymorphism.shapes.domain.*;
public class Canvas {

    public void drawShape(Shape shape) {
        shape.draw();
        System.out.println("  Area: " +  shape.calculateArea());
        System.out.println("  Circumference: " + shape.calculateCircumference());
    }

    public void eraseShape(Shape shape) {
        shape.erase();
    }
}
