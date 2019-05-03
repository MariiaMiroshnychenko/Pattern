package gof.composite.entity;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm circle");
    }
}
