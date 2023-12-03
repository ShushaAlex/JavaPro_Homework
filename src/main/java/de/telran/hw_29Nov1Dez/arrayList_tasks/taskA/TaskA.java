package de.telran.hw_29Nov1Dez.arrayList_tasks.taskA;

import de.telran.hw_20Nov.henFactory.Hen;

import java.util.List;

public class TaskA {
/*
    Найти сумму всех элементов ArrayList.
    Найти среднее значение элементов LinkedList.
    Перебрать ArrayList и вывести все элементы на экран.
    Перебрать LinkedList и найти самую длинную строку.
    Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
*/

    public static int calcSumOfElements(List<Integer> list) {
        int result = 0;
        for (Integer num :list){
            result += num;
        }
        return result;
    }
    public static int calcAverage(List<Integer> list) {
        int sum = calcSumOfElements(list);
        return sum / list.size();
    }
    public static void showEveryElement(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + "  ");
        }
    }
    public static void showEveryObjElement(List<Hen> list) {
        for (Hen hen : list) {
            System.out.println(hen.toString());
        }
    }
    public static String getLongestString(List<String> list) {
        String longestStr = list.get(0);
        for (String str : list) {
            if (longestStr.length() <= str.length()) {
                longestStr = str;
            }
        }
        return longestStr;
    }

}
