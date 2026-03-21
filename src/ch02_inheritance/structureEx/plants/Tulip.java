package ch02_inheritance.structureEx.plants;

public class Tulip extends  Flower{

    private String season;

    public Tulip(String name, int height, String color, String season) {
        super(name, height, color);
        this.season = season;
    }
}
