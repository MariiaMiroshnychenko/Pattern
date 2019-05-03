package gof.builder.difficult.director;

import gof.builder.difficult.CarBuilder;
import gof.builder.entity.Car;

public class Director {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar () {
        carBuilder.buildModel();
        carBuilder.buildTransmission();
        carBuilder.buildSpeed();
        return carBuilder.getCar();
    }
}
