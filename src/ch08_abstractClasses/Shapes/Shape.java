package ch08_abstractClasses.Shapes;

public abstract class Shape {

    public void erase() {
        System.out.println("Shape is erased");
    }

    public abstract void draw();

    public abstract double calculateArea();

    public abstract double calculateCircumference();
}