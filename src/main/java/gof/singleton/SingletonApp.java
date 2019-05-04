package gof.singleton;

import gof.singleton.entity.Singleton;
import gof.singleton.entity.Test;

public class SingletonApp {
    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 1000;

        Thread[] threads = new Thread[SIZE];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Test());
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println(Singleton.counter);
    }
}
