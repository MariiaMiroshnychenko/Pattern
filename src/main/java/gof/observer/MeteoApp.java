package gof.observer;

import gof.observer.meteo.entity.ConsoleObserver;
import gof.observer.meteo.entity.MeteoStation;

public class MeteoApp {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();

        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.setMeasurements(24, 760);
    }
}
