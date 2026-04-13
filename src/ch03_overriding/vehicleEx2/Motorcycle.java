package ch03_overriding.vehicleEx2;

import ch02_inheritance.vehicleEx.Vehicle;

/*
1. Bir önceki bölümde kurduğunuz arabalar ve motorsikletlerle ilgili modelde
bazı metotların ezilmesi (overridden) modeli daha iyi hale getirir mi?
Hangi metotların ezilmesi gerektiğini düşünürsünüz
 */

public class Motorcycle extends Vehicle {

    private int wheels;
    private String color;
    private static final int MAX_SPEED;

    static{
        MAX_SPEED = 350;
    }

    {
        wheels = 2;
    }

    public Motorcycle(String make, String model, String year, int speed, int distance, String color) {
        super(make, model, year, speed, distance);
        this.color = color;
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
}
