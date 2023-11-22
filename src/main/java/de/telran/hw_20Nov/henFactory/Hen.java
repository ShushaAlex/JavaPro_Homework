package de.telran.hw_20Nov.henFactory;

public abstract class Hen {
    public abstract int getCountOfEggsPerMonth();
    protected String getDescription() {
        return "I am chicken!";
    }

    @Override
    public String toString() {
        return "";
    }
}
