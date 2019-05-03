package gof.bridge.entity.type;

import gof.bridge.entity.Car;
import gof.bridge.entity.model.Model;

public class Hatchback extends Car {

    public Hatchback(Model model) {
        super(model);
    }

    @Override
    public void writeDetail() {
        System.out.println("Hatchback");
    }
}