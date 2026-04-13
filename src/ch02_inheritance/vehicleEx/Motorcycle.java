package ch02_inheritance.vehicleEx;

/*
1. Arabalar ve motorsikletler aslen birer araçtır ve benzer özellik ve davranışlara sahip oldukları gibi
kendilerine has özellik ve davranışlara sahiptirler. Bu durumu nasıl modellersiniz?
2. Yukarıdaki modelde kurucuları super() kullanarak modelleyin.
 */

public class Motorcycle extends Vehicle{

    private int wheels;
    private String color;

    {
        wheels = 2;
    }

    public Motorcycle(String make, String model, String year, int speed, int distance, String color) {
        super(make, model, year, speed, distance);
        this.color = color;
    }

}
