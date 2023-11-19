package de.telran.hw_17Nov.pizzeria.interfaces;

public interface Cashier {
    default void makeBill(String meal) {
        System.out.println("You need to pay for " + meal);
    }
    void takePayment(double sum);
}
