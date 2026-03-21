package ch02_inheritance.carEx;

// 4. Arabanın motoru vardır ve bu araba bir spor arabadır cümlelerini nasıl modellersiniz?

public class Engine {

    private double volume;
    private int cylinder;
    private int hp;
    private int torque;
    private FuelType fuelType;
    private int distance;
    private boolean hasBeenMaintenance;
    private boolean hasBeenOverhauled;

    public Engine(double volume, int cylinder, int hp, int torque, FuelType fuelType, int distance, boolean hasBeenMaintenance, boolean hasBeenOverhauled) {
        this.volume = volume;
        this.cylinder = cylinder;
        this.hp = hp;
        this.torque = torque;
        this.fuelType = fuelType;
        this.distance = distance;
        this.hasBeenMaintenance = hasBeenMaintenance;
        this.hasBeenOverhauled = hasBeenOverhauled;
    }


    public void start(){
        System.out.println("Hırrrr!");
    }

    public void stop(){
        System.out.println("Silence...");
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void printInfo() {
        System.out.println(volume + " cc " );
        System.out.println(cylinder + " cylinder");
        System.out.println(hp + " hp");
        System.out.println(torque + " Nm torque");
        System.out.println("Fuel type is " + fuelType.name() + " and the engine has traveled " + distance + " km so far." );
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isHasBeenMaintenance() {
        return hasBeenMaintenance;
    }

    public void setHasBeenMaintenance(boolean hasBeenMaintenance) {
        this.hasBeenMaintenance = hasBeenMaintenance;
    }

    public boolean isHasBeenOverhauled() {
        return hasBeenOverhauled;
    }

    public void setHasBeenOverhauled(boolean hasBeenOverhauled) {
        this.hasBeenOverhauled = hasBeenOverhauled;
    }


}

