package gof.state.radio.concrete;

import gof.state.radio.Station;

public class RadioHit implements Station {
    @Override
    public void play() {
        System.out.println("RadioHit is playing...");
    }
}
