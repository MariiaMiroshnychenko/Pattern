package gof.builder.difficult.concrete.car;

import gof.builder.difficult.CarBuilder;
import gof.builder.entity.Transmission;

public class OpelBuilder extends CarBuilder {
    @Override
    public void buildModel() {
        getCar().setModel("Opel");
    }

    @Override
    public void buildTransmission() {
        getCar().setTransmission(Transmission.MANUAL);
    }

    @Override
    public void buildSpeed() {
        getCar().setMaxSpeed(200);
    }
}
