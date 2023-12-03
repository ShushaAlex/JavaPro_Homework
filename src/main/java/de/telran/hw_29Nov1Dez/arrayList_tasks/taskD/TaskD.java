package de.telran.hw_29Nov1Dez.arrayList_tasks.taskD;

import java.util.List;

public class TaskD {
    /*
    Перебрать ArrayList и найти сумму квадратов всех элементов.
    Перебрать LinkedList и вычислить произведение всех элементов.
    Перебрать ArrayList и найти самую короткую строку.
    Перебрать LinkedList и заменить все гласные буквы в каждой строке на символ '*'.
    Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
     */
    public static int calcSumOfSquares(List<Integer> list) {
        int result = 0;
        for (Integer i : list) {
            result += (i * i);
        }
        return result;
    }
    public static int multiplyElems(List<Integer> list) {
        int result = 1;
        for (Integer i : list) {
            result *= i;
        }
        return result;
    }
    public static String getShortestStr(List<String> list) {
        String shortestStr = list.get(0);
        for (String s : list) {
            if (s.length() < shortestStr.length()) {
                shortestStr = s;
            }
        }
        return shortestStr;
    }
    public static void replaceVowels(List<String> list) {
        String[] vowels = {"a", "e", "i", "o", "u"};
    }

}
