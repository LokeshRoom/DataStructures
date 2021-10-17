package org.lokesh;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class LinearSearchInArray {

    public static int linearSearch(int[] numbers, int searchNum) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNum)
                return i;
        }
        return -1;
    }

    @Test
    public static void main(String[] args) {
        int[] numbers = {3, 5, 54, 56, 54, 64, 43};
        Assert.assertEquals(linearSearch(numbers, 56), Arrays.binarySearch(numbers, 56));
    }
}
