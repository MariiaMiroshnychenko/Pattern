package gof.factory.method.watch;

import gof.factory.method.watch.entity.DigitalWatch;
import gof.factory.method.watch.entity.Watch;
import gof.factory.method.watch.maker.DigitalWatchMaker;
import gof.factory.method.watch.maker.RomanWatchMaker;
import gof.factory.method.watch.maker.WatchMaker;

public class FactoryMethodApp {
    public static void main(String[] args) {
//        Watch digitalWatch = new DigitalWatch();
//
//        digitalWatch.showTime();
//------------------------------------------------------------------
//        WatchMaker digitalWatchMaker = new DigitalWatchMaker();
//        Watch watch = digitalWatchMaker.createWatch();
//        watch.showTime();
//------------------------------------------------------------------
        WatchMaker watchMaker = getMakerByName("Roman");
        Watch watch = watchMaker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equals("Roman")) {
            return new RomanWatchMaker();
        }
        throw new RuntimeException("Unsupported watch production line: " + maker);
    }
}
