package ch06_polymorphism.shapes.domain;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("Triangle drawed.");
    }
    @Override
    public void erase() {
        System.out.println("Triangle erased.");
    }
    @Override
    public double calculateArea() {
        return  Math.sqrt((a+b+c)/2 * ((a+b+c)/2 - a) * ((a+b+c)/2 - b) * ((a+b+c)/2 - c));
    }
    @Override
    public double calculateCircumference() {
        return a+b+c;
    }
}
