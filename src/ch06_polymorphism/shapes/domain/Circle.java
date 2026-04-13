package ch06_polymorphism.shapes.domain;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawed.");
    }
    @Override
    public void erase() {
        System.out.println("Circle erased.");
    }
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }
    @Override
    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
