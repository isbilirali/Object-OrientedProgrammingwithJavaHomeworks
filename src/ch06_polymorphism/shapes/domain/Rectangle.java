package ch06_polymorphism.shapes.domain;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawed.");
    }
    @Override
    public void erase() {
        System.out.println("Rectangle erased.");
    }
    @Override
    public double calculateArea() {
        return  width*height;
    }
    @Override
    public double calculateCircumference() {
        return 2.0*(width+height);
    }
}
