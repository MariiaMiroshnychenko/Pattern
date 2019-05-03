package gof.builder.difficult;

import gof.builder.entity.Car;
import gof.builder.entity.Transmission;

public abstract class CarBuilder {
    private Car car = new Car();

    public abstract void buildModel();
    public abstract void buildTransmission();
    public abstract void buildSpeed();

    public Car getCar () {
        return car;
    }
}
