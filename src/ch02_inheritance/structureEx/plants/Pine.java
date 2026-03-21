package ch02_inheritance.structureEx.plants;

public class Pine extends Tree {

    private boolean evergreen;

    public Pine(String name, int height, int trunkDiameter, boolean evergreen) {
        super(name, height, trunkDiameter);
        this.evergreen = evergreen;
    }
}
