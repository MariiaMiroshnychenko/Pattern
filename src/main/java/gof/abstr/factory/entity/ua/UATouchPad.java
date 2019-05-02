package gof.abstr.factory.entity.ua;

import gof.abstr.factory.entity.TouchPad;

public class UATouchPad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Змістилися на " + s + " пікселів");
    }
}
