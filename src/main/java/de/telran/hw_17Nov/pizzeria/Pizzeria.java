package de.telran.hw_17Nov.pizzeria;

import de.telran.hw_17Nov.pizzeria.interfaces.Cashier;
import de.telran.hw_17Nov.pizzeria.interfaces.Cleaner;
import de.telran.hw_17Nov.pizzeria.interfaces.Cook;
import de.telran.hw_17Nov.pizzeria.interfaces.Waitress;

public class Pizzeria implements Cashier, Waitress, Cook, Cleaner {
    private int ordersCount;
    private double proceeds;

    public int getOrdersCount() {
        return ordersCount;
    }

    public double getProceeds() {
        return proceeds;
    }
    @Override
    public void makeBill(String meal) {
        Cashier.super.makeBill(meal);
    }

    @Override
    public void takePayment(double sum) {
        System.out.println("Thank you for your payment!");
        proceeds += sum;
    }

    @Override
    public void takeOrder(String meal) {
        System.out.println("You ordered " + meal);
        ordersCount += 1;
    }

    @Override
    public void takeOutOrder() {
        Waitress.super.takeOutOrder();
    }

    @Override
    public void cleanTable() {
        Waitress.super.cleanTable();
    }

    @Override
    public void cookMeal(String meal) {
        Cook.super.cookMeal(meal);
    }

    @Override
    public void washDishes() {
        Cook.super.washDishes();
    }
}
