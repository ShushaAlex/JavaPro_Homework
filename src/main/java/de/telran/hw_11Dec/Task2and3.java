package de.telran.hw_11Dec;

import java.util.HashMap;
import java.util.Map;


public class Task2and3 {
    /*
Найти первый элемент, встречающийся k раз в массиве
 */
    public static int getElement(int[] arr, int count) {
        Map<Integer, Integer> elemCount = new HashMap<>();
        for (int elem : arr) {
            elemCount.put(elem, elemCount.getOrDefault(elem, 0) + 1);
            if (elemCount.get(elem) == count)
                return elem;
        }
        return -1;
    }

    /*
Проверьте, равны ли два массива или нет с точки зрения набора хранимых значений.
Не обязательно индексы равных элементов должны совпадать.
 */

    public static boolean areEqualsArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        Map<Integer, Integer> map1 = new HashMap();
        for (int elem : arr1) {
            map1.put(elem, map1.getOrDefault(elem, 0) + 1);
        }
        Map<Integer, Integer> map2 = new HashMap();
        for (int elem : arr2) {
            map2.put(elem, map2.getOrDefault(elem, 0) + 1);
        }
        return  map1.equals(map2);
    }
    public static void main(String[] args) {
        //Task2
        int[] array = {1, 2, 2, 3, 2, 3, 5, 4, 3, 65, 8, 9};
        System.out.println(getElement(array, 9));
        System.out.println(getElement(array, 3));

        //Task3
        int[] array2 = {5, 2, 2, 3, 2, 3, 1, 4, 3, 9, 8, 65};
        System.out.println(areEqualsArrays(array2, array));
    }
}
