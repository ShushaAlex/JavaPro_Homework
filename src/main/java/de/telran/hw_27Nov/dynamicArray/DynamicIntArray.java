package de.telran.hw_27Nov.dynamicArray;

import java.util.Arrays;

public class DynamicIntArray {
    private int length;
    private int capacity;
    private int[] arr = new int[DEFAULT_CAPACITY];
    public static int DEFAULT_CAPACITY = 10;
    public static double PERCENT_CHANGE = 1.5;

    public DynamicIntArray() {
        this.capacity = DEFAULT_CAPACITY;
    }
    public DynamicIntArray(int capacity) {
        this.capacity = capacity;
    }

    void add(int element) {
        if (length < capacity) {
            arr[length] = element;
            length++;
        } else {
            int[] newArr = new int[((int)(capacity * PERCENT_CHANGE))];
            capacity = ((int)(capacity * PERCENT_CHANGE));
            copyElements(arr, newArr);
            arr = newArr;
            add(element);
        }
    }
    public void add(int[] elements) {
        if (length + elements.length < capacity) {
            copyElements(arr, elements, length);
            length = length + elements.length;
        } else {
            int[] newArr = new int[((int)(capacity * PERCENT_CHANGE))];
            capacity = ((int)(capacity * PERCENT_CHANGE));
            copyElements(arr, newArr);
            arr = newArr;
            add(elements);
        }
    }
    public void insert (int index, int element) {
        if (length < capacity) {
            for (int i = capacity - 1; i > index; i--) {
                int tmp = arr[i - 1];
                arr[i] = tmp;
            }
            arr[index] = element;
            length++;
        } else {
            int[] newArr = new int[((int)(capacity * PERCENT_CHANGE))];
            capacity = ((int)(capacity * PERCENT_CHANGE));
            copyElements(arr, newArr);
            arr = newArr;
            insert(index, element);
        }
    }
    public void delete (int index) {
        for (int i = index; i < arr.length; i++) {
            int tmp = arr[i + 1];
            arr[i] = tmp;
        }
    }
    int getElem(int index) {
        return arr[index];
    }
    public int[] getIndexes(int elem) {
        int[] result = new int[length];
        int iResult = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                result[iResult] = i;
                iResult++;
            }
        }
        return result;
    }

    private void copyElements(int[] oldArr, int[] newArr) {
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
    }
    private void copyElements(int[] oldArr, int[] newElements, int startIndex) {
        int start = startIndex;
        for (int i = 0; i < newElements.length; i++) {
            oldArr[start] = newElements[i];
            start++;
        }
    }
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
