package de.telran.hw_17Nov.toys.interfaces;

public interface BoatInterface extends ToyInterface {
    default void swim() {
        System.out.println("I can swim");
    }
}
