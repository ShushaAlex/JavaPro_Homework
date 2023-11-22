package de.telran.hw_20Nov.henFactory.henTypes;

import de.telran.hw_20Nov.henFactory.Hen;

public class RussianHen extends Hen {
    private int eggsPerDay;

    private final String land = "Russia";
    public RussianHen(int eggsPerDay) {
        this.eggsPerDay = eggsPerDay;
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return eggsPerDay * 30;
    }

    public String getDescription() {
        return "I am from " + land + ". I produce " + getCountOfEggsPerMonth() + " eggs per months.";
    }

    @Override
    public String toString() {
        return "RussianHen{" +
                "eggsPerDay=" + eggsPerDay +
                ", land='" + land + '\'' +
                "} " + super.toString();
    }
}
