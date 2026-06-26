package ch08_abstractClasses.Shapes;

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void draw() {
        super.erase();
        System.out.println("Drawing Circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * r;
    }
}
