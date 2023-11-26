package de.telran.hw_24Nov.logisticApp.transportTypes;

public class Bus implements Transport {
    private int kmh = 80;
    private int ctPerKm = 20;

    @Override
    public void moveFromAtoB(String placeA, String placeB) {
        System.out.println("You ride by bus from " + placeA + " to " + placeB);
    }
    public int calcParams(int distance) {
        return distance * ctPerKm + distance / kmh;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "kmh=" + kmh +
                ", ctPerKm=" + ctPerKm +
                '}';
    }
}
