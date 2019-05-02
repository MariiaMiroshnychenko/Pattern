package gof.strategy.concrete;

import gof.strategy.entity.ArraySorting;

import java.util.Arrays;

public class SelectionSort implements ArraySorting {
    @Override
    public void sort(int[] array) {
        System.out.println("Selection Sort");
        System.out.println("Before: " + Arrays.toString(array));

        for (int barrier = 0; barrier < array.length - 1; barrier++) {
            for (int i = barrier + 1; i < array.length; i++) {
                if (array[i] < array[barrier]) {
                    int temp = array[i];
                    array[i] = array[barrier];
                    array[barrier] = temp;
                }
            }
        }

        System.out.println("After: " + Arrays.toString(array));
    }
}
