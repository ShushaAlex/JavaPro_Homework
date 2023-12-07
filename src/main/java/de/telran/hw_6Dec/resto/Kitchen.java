package de.telran.hw_6Dec.resto;

import java.util.LinkedHashSet;

/*
В ресторане официанты подают заказы Order на кухню. Очень важно чтобы заказы брались в работу поварами строго в том порядке,
в котором они были переданы на кухню. Создайте множество (Set) заказов, которые будут передаваться на кухню официантом и реализуйте
механизм взятия в работу этих заказом поваром.
Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
Характеристики Order определите самостоятельно.
 */
public class Kitchen {
    public static void cookMeal(LinkedHashSet<Order> orders) {
        for (Order order : orders) {
            System.out.println("I'm cooking " + order.getDish() + " from order #" + order.getNumber());
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<Order> orders = new LinkedHashSet<>();
        orders.add(new Order(1, "Beef"));
        orders.add(new Order(2, "Chicken"));
        orders.add(new Order(3, "Broccoli"));
        orders.add(new Order(4, "Pears"));
        orders.add(new Order(5, "Cheese"));
        System.out.println(orders);
        cookMeal(orders);

    }
}
