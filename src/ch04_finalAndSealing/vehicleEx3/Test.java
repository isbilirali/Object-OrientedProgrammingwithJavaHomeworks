package ch04_finalAndSealing.vehicleEx3;

/*
3. Sadece “Engine started!” mesajını basan startEngine() metoduna
sahip bir Vehicle sınıfı düşünün ve bu sınıfın Car vb. alt sınıfları olsun.
startEngine() metodunu final yapmayı düşünür müsünüz? NO
a. Vehicle sınıfına final olan ve olmayan iki metot daha ekleyin.
 */

public class Test {
    static void main() {
        Vehicle car1 = new TeslaModelY();
        car1.startEngine();
        car1.stopEngine();

        System.out.println();

        Vehicle car2 = new DodgeChallangerHellcat();
        car2.startEngine();
        car2.stopEngine();


    }
}
