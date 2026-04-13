package ch04_finalAndSealing.coordinateSystemDesign;

/*
2. x ve y koordinatlarına sahip bir noktayı modelleyin. Bu sınıfın x ve y koordinatlarını final yapmayı düşünür müsünüz? YES
Bu sınıfa geçilen başka bir noktaya olan uzaklığını bulup döndüren bir metot ekleyin. Bu metodun final olmasını düşünür müsünüz? NO
Sınıfın final olmasını düşünür müsünüz? NO
 */

public class Point2D {

    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    //can be override by child classes if there are
    public double distanceTo(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
