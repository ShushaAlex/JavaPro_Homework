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
        System.out.println("array after addElement 10, 4, 1, 12: " + array);
        array.add(newArr);
        System.out.println("array after addElements {1, 4, 5, 6, 7, 4, 2, 6, 2}: " + array);
        array.insert(0, 777);
        System.out.println("array after insert element 777 to index 0: " + array);
        System.out.println("getElem at index 3: " + array.getElem(3));
        System.out.println("getIndexes of element 6: " + Arrays.toString(array.getIndexes(6)));
        array.delete(2);
        System.out.println("array after delete index 2 " + array);
    }
}
