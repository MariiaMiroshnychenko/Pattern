package gof.bridge.entity.model;

public class Skoda implements Model {
    @Override
    public void setModel() {
        System.out.println("I'm Skoda");
    }
}
