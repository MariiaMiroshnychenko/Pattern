package gof.builder.simple;

import gof.builder.entity.Car;
import gof.builder.entity.Transmission;

public class CarBuilder {
    String carModel = "Default";
    Transmission carTransmission = Transmission.MANUAL;
    int carSpeed = 120;

    public CarBuilder buildModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public CarBuilder buildTransmission(Transmission carTransmission) {
        this.carTransmission = carTransmission;
        return this;
    }

    public CarBuilder buildSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
        return this;
    }

    public Car build () {
        Car car = new Car();

        car.setModel(carModel);
        car.setTransmission(carTransmission);
        car.setMaxSpeed(carSpeed);

        return car;
    }
}
