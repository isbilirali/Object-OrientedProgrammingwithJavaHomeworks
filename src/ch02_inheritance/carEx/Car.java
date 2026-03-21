package ch02_inheritance.carEx;

// 4. Arabanın motoru vardır ve bu araba bir spor arabadır cümlelerini nasıl modellersiniz?

public class Car{
    protected String make;
    protected String model;
    protected String year;
    protected int speed;
    protected Engine engine; //usage (has-a) assosicaiton

    public Car(String make, String model, String year, int speed, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.engine = engine; //aggreggation
    }

    public void accelarete(int newSpeed){
        engine.start();
        speed = newSpeed;
        System.out.println("Speed : " + speed);
    }

    public void stop(){
        speed = 0;
        engine.stop();
    }

    public void go(int length){
        engine.setDistance(engine.getDistance() + length);
    }

    public void printInfo(){
        System.out.println(year + " " + make + " " + model);
        engine.printInfo();
    }


}
