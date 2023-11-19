package de.telran.hw_17Nov.pizzeria;

import de.telran.hw_17Nov.pizzeria.interfaces.Cashier;
import de.telran.hw_17Nov.pizzeria.interfaces.Cleaner;
import de.telran.hw_17Nov.pizzeria.interfaces.Cook;
import de.telran.hw_17Nov.pizzeria.interfaces.Waitress;

/*
   У нас есть пиццерия. В ней работает несколько человек.
   Кассир - выставляет счет, принимает оплату.
   Официант - принимает заказ, выносит заказ, принимает оплату, убирает стол.
   Повар - готовит заказ, выносит заказ и моет посуду (очень редко).
   Уборщик - убирает стол, моет посуду.
   Реализовать класс процесса работы пиццерии с разделением обязанностей по вышеуказанному поведению.
*/
public class PizzeriaDemo {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        Waitress waitress = pizzeria;
        waitress.cleanTable();
        waitress.takeOrder("Chicken");
        waitress.takePayment(12.5);
        System.out.println(pizzeria.getProceeds());
        System.out.println(pizzeria.getOrdersCount());

        Cook cook = pizzeria;
        cook.cookMeal("Beef");
        cook.washDishes();
        cook.takeOutOrder();

        Cleaner cleaner = pizzeria;
        cleaner.cleanTable();
        cleaner.washDishes();

        Cashier cashier = pizzeria;
        cashier.makeBill("Beef");
        cashier.takePayment(23.9);

        waitress.takeOrder("Beef");

        System.out.println(pizzeria.getProceeds());
        System.out.println(pizzeria.getOrdersCount());
    }
}
