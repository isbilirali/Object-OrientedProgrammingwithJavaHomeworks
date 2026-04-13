package ch06_polymorphism.shapes.domain;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square drawed.");
    }
    @Override
    public void erase() {
        System.out.println("Square erased.");
    }
    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
    @Override
    public double calculateCircumference() {
        return side*4;
    }

}
