package gof.builder.difficult.concrete.car;

import gof.builder.entity.Transmission;
import gof.builder.simple.CarBuilder;

public class FordBuilder extends gof.builder.difficult.CarBuilder {
    @Override
    public void buildModel() {
        getCar().setModel("Ford");
    }

    @Override
    public void buildTransmission() {
        getCar().setTransmission(Transmission.AUTO);
    }

    @Override
    public void buildSpeed() {
        getCar().setMaxSpeed(220);
    }
}
