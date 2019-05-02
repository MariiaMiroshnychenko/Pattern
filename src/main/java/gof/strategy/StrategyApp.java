package gof.strategy;

import gof.strategy.concrete.BubbleSort;
import gof.strategy.concrete.InsertSort;
import gof.strategy.concrete.SelectionSort;
import gof.strategy.context.StrategyClient;

public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] array = {1, 5, 3, 2, 9, 4};

//        strategyClient.setArraySortingStrategy(new BubbleSort());
//        strategyClient.executeArraySortingStrategy(array);

        strategyClient.setArraySortingStrategy(new InsertSort());
        strategyClient.executeArraySortingStrategy(array);

//        strategyClient.setArraySortingStrategy(new SelectionSort());
//        strategyClient.executeArraySortingStrategy(array);
    }
}
