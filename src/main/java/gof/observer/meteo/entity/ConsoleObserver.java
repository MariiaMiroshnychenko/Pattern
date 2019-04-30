package gof.observer.meteo.entity;

import gof.observer.meteo.Observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("The weather has changed. Temperature: " + temperature + " degrees, pressure: " + pressure + " mmHg.");
    }
}
