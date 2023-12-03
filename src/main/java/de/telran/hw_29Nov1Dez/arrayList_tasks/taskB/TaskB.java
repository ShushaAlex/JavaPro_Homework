package de.telran.hw_29Nov1Dez.arrayList_tasks.taskB;

import java.util.List;

public class TaskB {
    /*
    Перебрать ArrayList и найти наименьший элемент.
    Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
    Перебрать LinkedList и найти наибольший элемент.
    Перебрать LinkedList и найти первое вхождение определенной строки.
    Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
     */
    public static int getSmallestNum(List<Integer> list) {
        int smallestNum = list.get(0);
        for (Integer i : list) {
            if (smallestNum <= i) {
                smallestNum = i;
            }
        }
        return smallestNum;
    }
    public static int getCountOfElemsWithChar(List<String> list, char letter) {
        int count = 0;
        for (String str : list) {
            if (str.charAt(0) == letter) {
                count += 1;
            }
        }
        return count;
    }
    public static int getBiggestNum(List<Integer> list) {
        int biggestNum = list.get(0);
        for (Integer i : list) {
            if (biggestNum >= i) {
                biggestNum = i;
            }
        }
        return biggestNum;
    }
    public static int getFirstAppearanceOfStr(List<String> list, String str) {
        int indexOfElem = -1;
        for (String s : list) {
            if (s.equals(str)) {
                return list.indexOf(s);
            }
        }
        return indexOfElem;
    }

}
