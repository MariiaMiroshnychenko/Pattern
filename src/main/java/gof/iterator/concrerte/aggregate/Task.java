package gof.iterator.concrerte.aggregate;

import gof.iterator.aggregate.Container;
import gof.iterator.entity.Iterator;

public class Task implements Container {
    String[] tasks = {"To do homework", "To write Diploma", "To have a shower", "To watch TV"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator{
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
