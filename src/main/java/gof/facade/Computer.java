package gof.facade;

import gof.facade.entity.DVDRom;
import gof.facade.entity.HDD;
import gof.facade.entity.Power;

public class Computer {
    private Power power = new Power();
    private DVDRom dvdRom = new DVDRom();
    private HDD hdd = new HDD();

    public void copy() {
        power.on();
        dvdRom.isData();
        hdd.copyFromDVD(dvdRom);
    }
}
