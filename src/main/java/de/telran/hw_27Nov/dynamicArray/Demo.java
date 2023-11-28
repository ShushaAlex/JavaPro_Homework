package de.telran.hw_27Nov.dynamicArray;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        DynamicIntArray array = new DynamicIntArray();
        int[] newArr = {1, 4, 5, 6, 7, 4, 2, 6, 2};
        array.add(10);
        array.add(4);
        array.add(1);
        array.add(12);
        array.add(10);
        array.add(4);
        array.add(1);
        array.add(12);
        array.add(1);
        array.add(12);
        array.add(4);
        System.out.println("array after addElement " + array);
        array.add(newArr);
        System.out.println("array after addElements " + array);
        array.insert(2, 666);
        array.insert(1, 555);
        array.insert(0, 777);
        System.out.println("array after insert " + array);
        System.out.println("getElem " + array.getElem(5));
        System.out.println("getIndexes " + Arrays.toString(array.getIndexes(6)));

    }
}
