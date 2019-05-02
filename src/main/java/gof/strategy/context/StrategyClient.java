package gof.strategy.context;

import gof.strategy.entity.ArraySorting;

public class StrategyClient {
    ArraySorting arraySortingStrategy;

    public void setArraySortingStrategy(ArraySorting arraySortingStrategy) {
        this.arraySortingStrategy = arraySortingStrategy;
    }

    public void executeArraySortingStrategy(int[] array) {
        arraySortingStrategy.sort(array);
    }
}
