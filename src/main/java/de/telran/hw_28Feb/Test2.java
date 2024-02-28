package de.telran.hw_28Feb;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        final int[] array = {1, 2, 3};
        new Object() {
            void add() {
                for (int i =0; i < array.length; i++) {
                    array[i] = array[i] * 2;
                }
            }
        }.add();
        System.out.println(Arrays.toString(array));
    }
}
