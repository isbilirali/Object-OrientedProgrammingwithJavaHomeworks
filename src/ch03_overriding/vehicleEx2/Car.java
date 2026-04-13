package ch03_overriding.vehicleEx2;

import ch02_inheritance.vehicleEx.Vehicle;


/*
1. Bir önceki bölümde kurduğunuz arabalar ve motorsikletlerle ilgili modelde
bazı metotların ezilmesi (overridden) modeli daha iyi hale getirir mi?
Hangi metotların ezilmesi gerektiğini düşünürsünüz
 */

public class Car extends Vehicle {

    private int wheels;
    private int door;
    private static final int MAX_SPEED;

    {
        wheels = 4;
    }
    static{
        MAX_SPEED = 200;
    }

    public Car(String make, String model, String year, int speed, int distance, int door) {
        super(make, model, year, speed, distance);
        this.door = door;
    }

    public void accelarete(int newSpeed){
        if(newSpeed>0){
            if(newSpeed < MAX_SPEED){
                speed = newSpeed;
            }else{
                speed = MAX_SPEED;
            }
            System.out.println("Speed : " + speed);
        }else{
            stop();
            System.out.println("Error! Engine has stopped.");
        }

    }

    public int getWheels() {
        return wheels;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}