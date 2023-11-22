package de.telran.hw_22Nov.Coffee;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getCoffeeMachine();
        coffeeMachine.makeAmericano();
        coffeeMachine.makeCappuccino();

    }
}
