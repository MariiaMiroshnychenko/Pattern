package gof.strategy.concrete;

import gof.strategy.entity.ArraySorting;

import java.util.Arrays;

public class BubbleSort implements ArraySorting{
    @Override
    public void sort(int[] array) {
        System.out.println("Bubble sort");
        System.out.println("Before: " + Arrays.toString(array));

        for (int barrier = array.length - 1; barrier >= 0 ; barrier--) {
            for (int j = 0; j < barrier; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("After: " + Arrays.toString(array));
    }
}
