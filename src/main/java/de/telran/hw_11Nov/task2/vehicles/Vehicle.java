package de.telran.hw_11Nov.task2.vehicles;

public class Vehicle {
    private boolean driversLicenseIsRequired;
    private byte wheelsCount;
    private boolean isForKids;
    private boolean isElectric;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isForKids() {
        return isForKids;
    }

    public void setForKids(boolean forKids) {
        isForKids = forKids;
    }

    public byte getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(byte wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public boolean isDriversLicenseIsRequired() {
        return driversLicenseIsRequired;
    }

    public void setDriversLicenseIsRequired(boolean driversLicenseIsRequired) {
        this.driversLicenseIsRequired = driversLicenseIsRequired;
    }

    @Override
    public String toString() {
        return "driversLicenseIsRequired=" + driversLicenseIsRequired +
                ", wheelsCount=" + wheelsCount +
                ", isForKids=" + isForKids +
                ", isElectric=" + isElectric +
                ", model=" + model;
    }
}
