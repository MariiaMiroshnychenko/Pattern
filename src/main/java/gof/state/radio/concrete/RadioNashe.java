package gof.state.radio.concrete;

import gof.state.radio.Station;

public class RadioNashe implements Station {
    @Override
    public void play() {
        System.out.println("RadioNashe is playing...");
    }
}
