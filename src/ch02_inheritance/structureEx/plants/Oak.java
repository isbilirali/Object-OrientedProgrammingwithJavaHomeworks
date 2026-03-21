package ch02_inheritance.structureEx.plants;

public class Oak extends Tree{

    private int acornProduction;

    public Oak(String name, int height, int trunkDiameter, int acornProduction) {
        super(name, height, trunkDiameter);
        this.acornProduction = acornProduction;
    }
}
