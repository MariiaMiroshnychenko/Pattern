package gof.state.radio;

import gof.state.radio.concrete.RadioLux;
import gof.state.radio.context.Radio;

public class Main {
    public static void main(String[] args) {
        Station station = new RadioLux();
        Radio radio = new Radio();

        radio.setStation(station);

        for (int i = 0; i < 5; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}
