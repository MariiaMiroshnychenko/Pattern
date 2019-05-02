package gof.factory.method.watch.maker;

import gof.factory.method.watch.entity.RomanWatch;
import gof.factory.method.watch.entity.Watch;

public class RomanWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomanWatch();
    }
}
