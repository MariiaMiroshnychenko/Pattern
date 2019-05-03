package gof.flyweight.concrete;

import gof.flyweight.entity.Figure;

public class Circle implements Figure {
    @Override
    public void draw(int x, int y) {
        int radius = 8;
        System.out.println("(" + x + ", " + y + ") - drawing circle with radius " + radius);
    }
}
