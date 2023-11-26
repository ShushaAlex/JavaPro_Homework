package de.telran.hw_24Nov.printerApp;

import de.telran.hw_24Nov.logisticApp.transportTypes.Plane;

public class Printer {
    private static Printer INSTANCE = null;
    private String name;
    private int pagesPerMin;

    private Printer(String name, int pagesPerMin) {
        this.name = name;
        this.pagesPerMin = pagesPerMin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPagesPerMin(int pagesPerMin) {
        this.pagesPerMin = pagesPerMin;
    }

    public static Printer getPrinter(String name, int pagesPerMin) {
        if (INSTANCE == null) {
            INSTANCE = new Printer(name, pagesPerMin);
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", pagesPerMin=" + pagesPerMin +
                '}';
    }
}
