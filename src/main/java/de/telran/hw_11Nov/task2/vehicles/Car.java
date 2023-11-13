package de.telran.hw_11Nov.task2.vehicles;

public class Car extends Vehicle {
    private byte wheelsNumber;
    private byte seatsNumber;
    private boolean isElectric;

    public byte getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(byte wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public byte getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(byte seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
