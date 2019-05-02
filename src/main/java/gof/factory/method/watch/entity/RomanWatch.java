package gof.factory.method.watch.entity;

public class RomanWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}
