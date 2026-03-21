package ch02_inheritance.structureEx.plants;

public class Rose extends Flower{

    private boolean hasThorns;

    public Rose(String name, int height, String color, boolean hasThorns) {
        super(name, height, color);
        this.hasThorns = hasThorns;
    }
}
