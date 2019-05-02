package gof.abstr.factory.entity.en;

import gof.abstr.factory.entity.TouchPad;

public class ENTouchPad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Moved on " + s + " pixels");
    }
}
