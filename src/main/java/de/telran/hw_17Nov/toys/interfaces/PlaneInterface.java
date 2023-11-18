package de.telran.hw_17Nov.toys.interfaces;

public interface PlaneInterface extends ToyInterface {
   default void fly() {
       System.out.println("I can fly!");
   }
}
