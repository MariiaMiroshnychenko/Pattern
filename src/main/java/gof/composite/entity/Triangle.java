package gof.composite.entity;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm triangle");
    }
}
