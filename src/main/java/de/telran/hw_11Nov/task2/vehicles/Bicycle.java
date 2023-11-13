package de.telran.hw_11Nov.task2.vehicles;

public class Bicycle extends Vehicle {
    private String bikeType;
    private int bikeSize;

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public int getBikeSize() {
        return bikeSize;
    }

    public void setBikeSize(int bikeSize) {
        this.bikeSize = bikeSize;
    }

    @Override
    public String toString() {
        return "bikeType=" + bikeType +
                ", bikeSize=" + bikeSize +
                super.toString();
    }
}
