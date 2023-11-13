package de.telran.hw_11Nov.task2.vehicles;

public class Motorbike extends Car {
    private String motorbikeType;

    public String getMotorbikeType() {
        return motorbikeType;
    }

    public void setMotorbikeType(String motorbikeType) {
        this.motorbikeType = motorbikeType;
    }

    @Override
    public String toString() {
        return "motorbikeType='" + motorbikeType +
               super.toString();
    }
}
