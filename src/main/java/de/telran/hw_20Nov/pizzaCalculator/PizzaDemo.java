package de.telran.hw_20Nov.pizzaCalculator;
/*
Вы работаете в пицерии.
Клиент у Вас может заказать пиццу различных размеров и различных форм: квадратную, прямоугольную, круглую.
Напишите методы для вычисления калорийности заказанной пиццы, если напримем кв.см. пиццы имеет 40 калорий.
Попробуйте решить данную задачу через перегрузку методов.
 */
public class PizzaDemo {

    public static double calcCalories(double width, double length) {
        return width * length * 40;
    }
    public static double calcCalories(double radius) {
        return radius * radius * 3.14 * 40;
    }
    public static int calcCalories(int side) {
        return side * side * 40;
    }

    public static void main(String[] args) {
        double normalPizzaCal = calcCalories(20, 20);
        double rectanglePizza = calcCalories(10.0);
        int squarePizza = calcCalories(10);

        System.out.println("Normal pizza has " + normalPizzaCal + " calories");
        System.out.println("Rectangle pizza has " + rectanglePizza + " calories");
        System.out.println("Square pizza has " + squarePizza + " calories");
    }
}
