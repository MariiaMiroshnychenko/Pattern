package gof.iterator;

import gof.iterator.concrerte.aggregate.Task;
import gof.iterator.entity.Iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Task task = new Task();
        Iterator iterator = task.getIterator();

        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
