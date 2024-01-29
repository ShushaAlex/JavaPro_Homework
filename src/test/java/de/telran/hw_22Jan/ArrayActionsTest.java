package de.telran.hw_22Jan;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayActionsTest {
    static ArrayActions aa;

    @BeforeAll
    static void beforeAll() {
        aa = new ArrayActions();
    }
    @Test
    void getCommonElements() {
        Integer[] expVal = {1,7};
        int[] arr1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 = {1, 0, 6, 15, 6, 4, 7, 0};
        Integer[] actVal = aa.getCommonElements(arr1, arr2);
        assertArrayEquals(expVal, actVal);
    }
    @Test
    void deleteDabbles() {
        int[] expVal = {0,3,-2,4,2};
        int[] array = {0,3,-2,4,3,2};
        int[] actualVal = aa.deleteDabbles(array);
        assertArrayEquals(expVal, actualVal);
    }
    @Test
    void getSecondBigInt() {
        int expVal = 4;
        int[] arr = {-1, 4, 0, 2, 7, -3};
        int actualVal = aa.getSecondBigInt(arr);
        assertEquals(expVal, actualVal);
    }

    @Test
    void getSecondSmallInt() {
        int expVal = -1;
        int[] arr = {-1, 4, 0, 2, 7, -3};
        int actualVal = aa.getSecondSmallInt(arr);
        assertEquals(expVal, actualVal);
    }
}