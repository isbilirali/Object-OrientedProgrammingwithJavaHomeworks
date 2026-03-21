package ch02_inheritance.vehicleEx;

/*
1. Arabalar ve motorsikletler aslen birer araçtır ve benzer özellik ve davranışlara sahip oldukları gibi
kendilerine has özellik ve davranışlara sahiptirler. Bu durumu nasıl modellersiniz?
2. Yukarıdaki modelde kurucuları super() kullanarak modelleyin.
 */

public class Test {
    static void main() {
        Car car = new Car("Mercedes","Vito","2017",0,150000,3);
        Motorcycle motor = new Motorcycle("CFMOTO","250NK","2020",0,28000,"Blue");

        car.accelarete(300);
        motor.accelarete(300);
    }
}
