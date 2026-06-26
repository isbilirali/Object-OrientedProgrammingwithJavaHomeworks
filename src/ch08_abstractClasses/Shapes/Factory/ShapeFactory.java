package ch08_abstractClasses.Shapes.Factory;

import ch08_abstractClasses.Shapes.*;

import java.util.Random;

public class ShapeFactory {

    private static final Random random = new Random();

    public static Shape createShape() {

        int choice = random.nextInt(4);

        switch (choice) {
            case 0:
                return new Circle(5);
            case 1:
                return new Rectangle(4, 6);
            case 2:
                return new Square(4);
            default :
                return new Triangle(3, 4, 5);
        }

    }
}
