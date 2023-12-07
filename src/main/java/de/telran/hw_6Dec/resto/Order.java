package de.telran.hw_6Dec.resto;

import java.util.Objects;

public class Order implements Comparable<Order>{
    private int number;
    private String dish;

    public Order(int number, String dish) {
        this.number = number;
        this.dish = dish;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number == order.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }


    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.number, o.number);
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", dish='" + dish + '\'' +
                '}';
    }
}
