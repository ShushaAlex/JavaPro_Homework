package de.telran.hw_17Nov.pizzeria.interfaces;

public interface Cook {
    default void takeOutOrder() {
        System.out.println("Enjoy your meal!");
    }
    default void cookMeal(String meal) {
        System.out.println("Your " + meal + " is cooked");
    }
    default void washDishes() {
        System.out.println("All dishes are clean!");
    }
}
