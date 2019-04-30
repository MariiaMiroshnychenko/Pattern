package gof.state.radio.concrete;

import gof.state.radio.Station;

public class RadioLux implements Station {
    @Override
    public void play() {
        System.out.println("RadioLux is playing...");
    }
}
