package de.telran.hw_20Nov.henFactory.henTypes;

import de.telran.hw_20Nov.henFactory.Hen;

public class UkrainianHen extends Hen {
    private int eggsPerMonth;
    private final String land = "Ukraine";

    public UkrainianHen(int eggsPerMonth) {
        this.eggsPerMonth = eggsPerMonth;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return eggsPerMonth;
    }

    public String getDescription() {
        return "I am from " + land + ". I produce " + getCountOfEggsPerMonth() + " eggs per months.";
    }

    @Override
    public String toString() {
        return "UkrainianHen{" +
                "eggsPerMonth=" + eggsPerMonth +
                ", land='" + land + '\'' +
                "} " + super.toString();
    }
}
