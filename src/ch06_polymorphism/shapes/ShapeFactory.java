package ch06_polymorphism.shapes;

import ch06_polymorphism.shapes.domain.*;
import java.util.Random;

public class ShapeFactory {
    private Random rand = new Random();

    public Shape createShape() {
        int type = rand.nextInt(4);
        switch (type) {
            case 0: return new Circle(rand.nextDouble() * 10 + 1);
            case 1: return new Rectangle(rand.nextDouble() * 10 + 1, rand.nextDouble() * 10 + 1);
            case 2: return new Square(rand.nextDouble() * 10 + 1);
            case 3: return new Triangle(3, 4, 5);
            default: return new Circle(5);
        }
    }
}