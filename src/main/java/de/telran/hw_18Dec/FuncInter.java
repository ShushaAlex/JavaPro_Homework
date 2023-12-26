package de.telran.hw_18Dec;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class FuncInter {
    public static void main(String[] args) {
        BiConsumer<String,String> work = (t, u) -> System.out.println(t + " is making " + u);
        work.accept("Pete", "dinner");

        work = (t, u) -> System.out.println(t + ", it's time to build a " + u);
        work.accept("Pete", "house");

        BiFunction<Integer, Integer, Integer> calcWork = (t, u) -> t * u + 200;
        System.out.println("Полная стоимость работ - " + calcWork.apply(10, 25) + ". Из них 200 евро - предоплата");
        calcWork = (t, u) -> t * u;
        System.out.println("Вы внесли 200 евро предоплату. Вам осталось доплатить - " + calcWork.apply(10, 25));
    }
}
