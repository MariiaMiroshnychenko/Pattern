package gof.strategy.concrete;

import gof.strategy.entity.ArraySorting;

import java.util.Arrays;

public class InsertSort implements ArraySorting {
    @Override
    public void sort(int[] array) {
        System.out.println("Insertion sort");
        System.out.println("Before: " + Arrays.toString(array));

        for (int barrier = 1; barrier < array.length; barrier++) {
            int index = barrier;
            while (index - 1 >= 0 && array[index] < array[index - 1]) {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
        
        System.out.println("After: " + Arrays.toString(array));
    }
}
