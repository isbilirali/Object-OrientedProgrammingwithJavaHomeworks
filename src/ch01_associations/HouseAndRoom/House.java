package ch01_associations.HouseAndRoom;

import java.util.ArrayList;
import java.util.List;

/*
Ev ile odaları arasındaki ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

//------> tight usage (has-a) association - composition , 1-N , uni-directional

public class House {

    private List<Room> rooms;

    public House() {
        rooms = new ArrayList<>(); //ev olmadan odaların varlığı tanımlanamaz.
    }

    public void addRoom(String roomName){
        rooms.add(new Room(roomName)); //odalar ev üzerinden oluşturulabilir.
    }

    public void printInfo(){
        System.out.println("Odalar : ");
        for (Room r : rooms){
            System.out.println(r.getName());
        }
    }
}
