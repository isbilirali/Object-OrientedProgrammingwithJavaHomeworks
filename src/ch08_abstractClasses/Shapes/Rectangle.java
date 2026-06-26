package ch08_abstractClasses.Shapes;

public class Rectangle extends Shape {

    protected double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        super.erase();
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double calculateArea() {
        return w * h;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (w + h);
    }
}
