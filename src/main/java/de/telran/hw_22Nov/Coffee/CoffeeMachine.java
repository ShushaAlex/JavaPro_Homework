package de.telran.hw_22Nov.Coffee;

public class CoffeeMachine {
    private static final CoffeeMachine COFFEE_MACHINE = new CoffeeMachine();
    private CoffeeMachine() {
    }
    public static CoffeeMachine getCoffeeMachine() {
        return COFFEE_MACHINE;
    }
    public void makeCappuccino() {
        System.out.println("Your cappuccino is ready!");
    }
    public void makeAmericano() {
        System.out.println("Your americano is ready!");
    }
}
