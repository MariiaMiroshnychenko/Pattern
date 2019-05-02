package gof.factory.method.watch.maker;

import gof.factory.method.watch.entity.DigitalWatch;
import gof.factory.method.watch.entity.Watch;

public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
