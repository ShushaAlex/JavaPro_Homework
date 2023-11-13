package de.telran.hw_11Nov.task2.vehicles;

public class Bus extends Car {
    private boolean isCommercial;

    public boolean isCommercial() {
        return isCommercial;
    }

    public void setCommercial(boolean commercial) {
        isCommercial = commercial;
    }

    @Override
    public String toString() {
        return "isCommercial=" + isCommercial + super.toString();
    }
}
