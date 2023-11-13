package de.telran.hw_11Nov.task2.vehicles;

public class Car extends Vehicle {
    private byte seatsNumber;
    private int engineCapacity;

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public byte getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(byte seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        return "seatsNumber=" + seatsNumber +
                ", engineCapacity=" + engineCapacity +
                " " + super.toString();
    }
}
