package ch08_abstractClasses.Shapes;

public class Square extends Shape {

    protected double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void draw() {
        super.erase();
        System.out.println("Drawing Square");
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculateCircumference() {
        return 4 * a;
    }
}
