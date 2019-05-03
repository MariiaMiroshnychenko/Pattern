package gof.bridge.entity;

import gof.bridge.entity.model.Model;

public abstract class Car {
    Model model;

    public Car(Model model) {
        this.model = model;
    }

    public void showDetails() {
        writeDetail();
        model.setModel();
    }

    public abstract void writeDetail();
}
