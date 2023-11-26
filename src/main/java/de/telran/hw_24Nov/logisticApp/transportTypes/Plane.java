package de.telran.hw_24Nov.logisticApp.transportTypes;

public class Plane implements Transport {
    private final int kmh = 800;
    private final int ctPerKm = 5;

    @Override
    public void moveFromAtoB(String placeA, String placeB) {
        System.out.println("You fly from " + placeA + " to " + placeB);
    }
    public int calcParams(int distance) {
        return distance * ctPerKm + distance / kmh;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "kmh=" + kmh +
                ", ctPerKm=" + ctPerKm +
                '}';
    }
}
