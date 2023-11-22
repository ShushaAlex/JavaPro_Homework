package de.telran.hw_20Nov.henFactory.henTypes;

import de.telran.hw_20Nov.henFactory.Hen;

public class BelarusianHen extends Hen {
    private int eggsPerWeek;
    private final String land = "Belarus";

    public BelarusianHen(int eggsPerWeek) {
        this.eggsPerWeek = eggsPerWeek;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return eggsPerWeek * 4;
    }

    public String getDescription() {
        return "I am from " + land + ". I produce " + getCountOfEggsPerMonth() + " eggs per months.";
    }

    @Override
    public String toString() {
        return "BelarusianHen{" +
                "eggsPerWeek=" + eggsPerWeek +
                ", land='" + land + '\'' +
                "} " + super.toString();
    }
}
