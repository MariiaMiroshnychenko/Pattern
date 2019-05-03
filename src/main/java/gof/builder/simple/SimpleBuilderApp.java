package gof.builder.simple;

import gof.builder.entity.Car;
import gof.builder.entity.Transmission;

public class SimpleBuilderApp {
    public static void main(String[] args) {
        Car car = new CarBuilder().buildModel("Alfa Romeo")
                                  .buildTransmission(Transmission.AUTO)
                                  .buildSpeed(200)
                                  .build();
        System.out.println(car);
    }
}
