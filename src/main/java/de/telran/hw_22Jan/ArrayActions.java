package de.telran.hw_22Jan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayActions {
    /* Напишите программу на Java для поиска общих элементов между двумя массивами целых чисел
    example input:
    Array1: [1, 2, 5, 5, 8, 9, 7, 10]
    Array2: [1, 0, 6, 15, 6, 4, 7, 0]
    example expected: [1,7] */

    public Integer[] getCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> firstArr = new HashSet<>();
        for (int n : arr1) {
            firstArr.add(n);
        }
        Set<Integer> commonElems = new HashSet<>();
        for (int n : arr2) {
            if (firstArr.contains(n)) commonElems.add(n);
        }
        Integer[] result = new Integer[commonElems.size()];
        return commonElems.toArray(result);
    }
    
    /*Напишите программу на Java для удаления повторяющихся элементов из массива.
    example input:
    [0,3,-2,4,3,2]
    example expected:
    [0,3,-2,4,2]*/
    public int[] deleteDabbles(int[] arr) {
        Set<Integer> clearArr = new LinkedHashSet<>();
        for (int n : arr) {
            clearArr.add(n);
        }
        int[] result = new int[clearArr.size()];
        int i = 0;
        for (Integer n : clearArr) {
            result[i++] = n;
        }
        return result;
    }

    /*Напишите программу на Java для поиска второго по величине элемента в массиве.
    example input:
    [-1, 4, 0, 2, 7, -3]
    example expected: 4 */
    public int getSecondBigInt(int[] arr) {
        int big1 = arr[0];
        int big2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (big1 < arr[i]) {
                big2 = big1;
                big1 = arr[i];
            }
        }
        return big2;
    }
 
    /*Напишите программу Java для поиска второго наименьшего элемента в массиве.
    example input:
    [-1, 4, 0, 2, 7, -3]
    example expected
    -1*/
    public int getSecondSmallInt(int[] arr) {
        int small1 = arr[0];
        int small2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (small1 > arr[i]) {
                small2 = small1;
                small1 = arr[i];
            }
        }
        return small2;
    }

}
