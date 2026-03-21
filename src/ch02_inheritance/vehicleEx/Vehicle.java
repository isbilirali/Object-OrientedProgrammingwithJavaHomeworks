package ch02_inheritance.vehicleEx;

/*
1. Arabalar ve motorsikletler aslen birer araçtır ve benzer özellik ve davranışlara sahip oldukları gibi
kendilerine has özellik ve davranışlara sahiptirler. Bu durumu nasıl modellersiniz?
2. Yukarıdaki modelde kurucuları super() kullanarak modelleyin.
 */

public class Vehicle {
    protected String make;
    protected String model;
    protected String year;
    protected int speed;
    protected int distance;


    public Vehicle(String make, String model, String year, int speed, int distance) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;

    }

    public void accelarete(int newSpeed){
        speed = newSpeed;
        System.out.println("Speed : " + speed);
    }

    public void stop(){
        speed = 0;
    }

    public void go(int length){
        distance += length;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
