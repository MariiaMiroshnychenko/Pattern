package gof.observer;

import gof.observer.meteo.entity.ConsoleObserver;
import gof.observer.meteo.entity.FileObserver;
import gof.observer.meteo.entity.MeteoStation;

public class MeteoApp {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();

        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setMeasurements(24, 760);
        meteoStation.setMeasurements(33, 754);
    }
}
