package ch01_associations.HouseAndRoom;

/*
Ev ile odaları arasındaki ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

//------> tight usage (has-a) association - composition , 1-N , uni-directional

public class Room {

    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
