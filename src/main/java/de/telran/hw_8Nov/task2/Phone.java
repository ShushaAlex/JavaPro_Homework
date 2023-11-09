package de.telran.hw_8Nov.task2;

public class Phone {
    private String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    void receiveCall(String name) {
        System.out.println(name + " is calling");
    }
}
