package org.lokesh.searching;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] number, int search) {
        return binarySearch(number, search, 0, number.length - 1);
    }

    private static int binarySearch(int[] number, int search, int begin, int end) {
        if (begin > end)
            return -1;
        int middle = (begin + end) / 2;
        if (number[middle] == search)
            return middle;
        if (number[middle] > search)
            return binarySearch(number, search, 0, middle - 1);
        return binarySearch(number, search, middle + 1, end);
    }

    @Test
    public void testBinarySearch() {
        int[] numbers = {1, 3, 5, 7, 9, 17, 22, 35, 53};
        int search = 55;
        int results = Arrays.binarySearch(numbers, 55);
        Assert.assertEquals(binarySearch(numbers, search), results > 0 ? results : -1);
    }
}
