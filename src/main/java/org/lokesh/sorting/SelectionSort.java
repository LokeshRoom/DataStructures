package org.lokesh.sorting;

import org.lokesh.reusable.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectedSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minIndex] > numbers[j])
                    minIndex = j;
            }
            ReusableMethods.swap(numbers, minIndex, i);
        }
        return numbers;
    }


    @Test
    public void testSelectionSort() {
        int[] numbers = {1, 4, 3, 5, 0, 6, -1, 34, 4, 4, 9, 5, 6, 56, 45};
        int[] res = {1, 4, 3, 5, 0, 6, -1, 34, 4, 4, 9, 5, 6, 56, 45};
        Arrays.sort(res);
        Assert.assertEquals(selectedSort(numbers), res);
    }
}
