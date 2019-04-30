package gof.observer.meteo;

public interface Observer {
    void handleEvent(int temperature, int pressure);
}
