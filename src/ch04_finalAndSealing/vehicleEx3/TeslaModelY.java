package ch04_finalAndSealing.vehicleEx3;

/*
3. Sadece “Engine started!” mesajını basan startEngine() metoduna
sahip bir Vehicle sınıfı düşünün ve bu sınıfın Car vb. alt sınıfları olsun.
startEngine() metodunu final yapmayı düşünür müsünüz? NO
a. Vehicle sınıfına final olan ve olmayan iki metot daha ekleyin.
 */

public class TeslaModelY extends Vehicle{

    public void startEngine() {
        System.out.println("Silence....    (Electric motor)");
    }

    protected double calculateCostPerKM(int km){
        return km*0.3;
    }
}
