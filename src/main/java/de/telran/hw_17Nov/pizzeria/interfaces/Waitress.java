package de.telran.hw_17Nov.pizzeria.interfaces;

public interface Waitress {
    void takePayment(double sum);
    void takeOrder(String meal);
    default void takeOutOrder() {
        System.out.println("Enjoy your meal!");
    }
    default void cleanTable() {
        System.out.println("I cleaned the table!");
    }
}
