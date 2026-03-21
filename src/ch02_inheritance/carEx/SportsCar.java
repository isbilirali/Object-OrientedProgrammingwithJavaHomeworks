package ch02_inheritance.carEx;

// 4. Arabanın motoru vardır ve bu araba bir spor arabadır cümlelerini nasıl modellersiniz?

public class SportsCar extends Car {

    private String color;
    private int maxSpeed;

    public SportsCar(String make, String model, String year, int speed, Engine engine, String color, int maxSpeed) {
        super(make, model, year, speed, engine);
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void printInfo(){
        System.out.println("******************************************************");
        super.printInfo();
        System.out.println("Color is " + color + " and max speed is " + maxSpeed);
        System.out.println("******************************************************");
    }

}
