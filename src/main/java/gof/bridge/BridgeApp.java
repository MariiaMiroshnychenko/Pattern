package gof.bridge;

import gof.bridge.entity.Car;
import gof.bridge.entity.model.AlfaRomeo;
import gof.bridge.entity.type.Hatchback;
import gof.bridge.entity.model.Kia;

public class BridgeApp {
    public static void main(String[] args) {
        Car car = new Hatchback(new AlfaRomeo());

        car.showDetails();
    }
}
