package ch02_inheritance.structureEx.plants;

public class Plant {

    protected String name;
    protected int height;

    public Plant(String name , int height){
        this.name = name;
        this.height = height;
    }

    public void grow(){
        height++;
        System.out.println("Succeed.");
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
