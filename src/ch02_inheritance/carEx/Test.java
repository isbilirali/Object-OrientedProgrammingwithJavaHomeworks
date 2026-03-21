package ch02_inheritance.carEx;

// 4. Arabanın motoru vardır ve bu araba bir spor arabadır cümlelerini nasıl modellersiniz?

public class Test {

    static void main() {

        Engine v8 = new Engine(6.2,8,717,889,"Gasoline",45000,true,false);

        SportsCar hellcat = new SportsCar("Dodge","Challanger SRT Hellcat","2023",0,v8,"Dark Black",327);

        hellcat.printInfo();
    }
}
