package de.telran.hw_20Nov.henFactory.henTypes;

import de.telran.hw_20Nov.henFactory.Hen;

public class MoldovanHen extends Hen {
    private int eggsPerTwoMonths;
    private final String land = "Moldova";

    public MoldovanHen(int eggsPerTwoMonths) {
        this.eggsPerTwoMonths = eggsPerTwoMonths;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return eggsPerTwoMonths / 2;
    }

    public String getDescription() {
        return "I am from " + land + ". I produce " + getCountOfEggsPerMonth() + " eggs per months.";
    }
}
