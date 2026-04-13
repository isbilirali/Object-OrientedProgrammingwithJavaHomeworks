package ch06_polymorphism.shapes.domain;

public class Shape {

    public Shape() {
        System.out.println("Shape created");
    }

    public void draw() {
        System.out.println("Shape drawed.");
    }

    public void erase() {
        System.out.println("Shape erased.");
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculateCircumference() {
        return 0.0;
    }
}
