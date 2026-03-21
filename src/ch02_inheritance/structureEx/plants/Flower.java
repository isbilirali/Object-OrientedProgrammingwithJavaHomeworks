package ch02_inheritance.structureEx.plants;

public class Flower extends Plant{

    protected String color;

    public Flower(String name , int height , String color){
        super(name,height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
