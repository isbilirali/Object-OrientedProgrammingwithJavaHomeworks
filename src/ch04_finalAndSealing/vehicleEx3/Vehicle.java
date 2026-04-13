package ch04_finalAndSealing.vehicleEx3;

/*
3. Sadece “Engine started!” mesajını basan startEngine() metoduna
sahip bir Vehicle sınıfı düşünün ve bu sınıfın Car vb. alt sınıfları olsun.
startEngine() metodunu final yapmayı düşünür müsünüz? NO
a. Vehicle sınıfına final olan ve olmayan iki metot daha ekleyin.
 */

public class Vehicle {

    public void startEngine() {
        System.out.println("Engine started!");
    }

    final void stopEngine() {
        System.out.println("Engine stopped...");
    }

    protected double calculateCostPerKM(int km){
        return km*0.9;
    }
}
