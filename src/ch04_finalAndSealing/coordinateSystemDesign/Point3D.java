package ch04_finalAndSealing.coordinateSystemDesign;

/*
2. x ve y koordinatlarına sahip bir noktayı modelleyin. Bu sınıfın x ve y koordinatlarını final yapmayı düşünür müsünüz? YES
Bu sınıfa geçilen başka bir noktaya olan uzaklığını bulup döndüren bir metot ekleyin. Bu metodun final olmasını düşünür müsünüz? NO
Sınıfın final olmasını düşünür müsünüz? NO
 */

public class Point3D extends Point2D {

    private final double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distanceTo(Point2D other) {
        if (other instanceof Point3D p3) {
            double dx = this.getX() - p3.getX();
            double dy = this.getY() - p3.getY();
            double dz = this.z - p3.z;
            return Math.sqrt(dx*dx + dy*dy + dz*dz);
        }
        return super.distanceTo(other);
    }

    @Override
    public String toString() {
        return "Point3D(" + getX() + ", " + getY() + ", " + z + ")";
    }

}
