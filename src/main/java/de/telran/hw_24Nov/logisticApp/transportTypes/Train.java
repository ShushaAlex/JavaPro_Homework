package de.telran.hw_24Nov.logisticApp.transportTypes;

public class Train implements Transport {
    private final int kmh = 70;
    private final int ctPerKm = 8;

    @Override
    public void moveFromAtoB(String placeA, String placeB) {
        System.out.println("You ride by train from " + placeA + " to " + placeB);
    }
    public int calcParams(int distance) {
        return distance * ctPerKm + distance / kmh;
    }

    @Override
    public String toString() {
        return "Train{" +
                "kmh=" + kmh +
                ", ctPerKm=" + ctPerKm +
                '}';
    }
}
