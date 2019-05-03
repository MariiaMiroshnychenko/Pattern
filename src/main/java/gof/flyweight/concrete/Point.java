package gof.flyweight.concrete;

import gof.flyweight.entity.Figure;

public class Point implements Figure {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") - drawing point");
    }
}
