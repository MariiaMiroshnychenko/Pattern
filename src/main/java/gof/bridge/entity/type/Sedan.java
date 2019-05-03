package gof.bridge.entity.type;

import gof.bridge.entity.Car;
import gof.bridge.entity.model.Model;

public class Sedan extends Car {
    public Sedan(Model model) {
        super(model);
    }

    @Override
    public void writeDetail() {
        System.out.println("Sedan");
    }
}
