package ch03_overriding.vehicleEx2;

import ch03_overriding.vehicleEx2.*;

/*
1. Bir önceki bölümde kurduğunuz arabalar ve motorsikletlerle ilgili modelde
bazı metotların ezilmesi (overridden) modeli daha iyi hale getirir mi?
Hangi metotların ezilmesi gerektiğini düşünürsünüz
 */

public class Test {
    static void main() {

        Car car = new Car("Mercedes","Vito","2017",0,150000,3);
        Motorcycle motor = new Motorcycle("CFMOTO","250NK","2020",0,28000,"Blue");

        car.accelarete(300); // 200 is max.
        motor.accelarete(300);


        car.accelarete(-100);

    }
}
