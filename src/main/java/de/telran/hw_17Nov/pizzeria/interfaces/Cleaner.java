package de.telran.hw_17Nov.pizzeria.interfaces;

public interface Cleaner {
    default void washDishes() {
        System.out.println("All dishes are clean!");
    }
    default void cleanTable() {
        System.out.println("I cleaned the table!");
    }
}
