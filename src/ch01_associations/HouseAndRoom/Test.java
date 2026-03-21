package ch01_associations.HouseAndRoom;

/*
Ev ile odaları arasındaki ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

//------> tight usage (has-a) association - composition , 1-N , uni-directional

public class Test {
    static void main() {
        House isbilirHouse = new House();
        isbilirHouse.addRoom("Living Room");
        isbilirHouse.addRoom("First Bedroom");
        isbilirHouse.addRoom("Second Bedroom");
        isbilirHouse.addRoom("Kitchen");
        isbilirHouse.addRoom("Dining Room");
        isbilirHouse.addRoom("Bathroom");

        isbilirHouse.printInfo();
    }
}
