package org.lokesh;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BubbleSort {

    private static int[] bubbleSort(int[] numbers) {
        if (numbers.length == 1)
            return numbers;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    ReusableMethods.swap(numbers, j - 1, j);
                }
            }
        }
        return numbers;
    }

    @Test
    public void testBubbleSort() {
        int[] numbers = {1, 4, 3, 5, 0, 6, -1, 34, 9, 5, 6, 56, 45};
        int[] res = {1, 4, 3, 5, 0, 6, -1, 34, 9, 5, 6, 56, 45};
        Arrays.sort(res);
        Assert.assertEquals(bubbleSort(numbers), res);
    }
}

