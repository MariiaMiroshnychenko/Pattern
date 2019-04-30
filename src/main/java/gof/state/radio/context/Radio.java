package gof.state.radio.context;

import gof.state.radio.concrete.RadioHit;
import gof.state.radio.concrete.RadioLux;
import gof.state.radio.concrete.RadioNashe;
import gof.state.radio.Station;

public class Radio {
    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void nextStation() {
        if (station instanceof RadioLux) {
           setStation(new RadioNashe());
        } else if (station instanceof RadioNashe) {
            setStation(new RadioHit());
        } else if (station instanceof RadioHit) {
            setStation(new RadioLux());
        }
    }

    public void play () {
        station.play();
    }
}
