package gof.singleton.entity;

public class Test implements Runnable {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}
