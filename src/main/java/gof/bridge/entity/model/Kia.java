package gof.bridge.entity.model;

public class Kia implements Model {
    @Override
    public void setModel() {
        System.out.println("I'm Kia");
    }
}
