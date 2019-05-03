package gof.flyweight.concrete;

import gof.flyweight.entity.Figure;

public class Square implements Figure {
    @Override
    public void draw(int x, int y) {
        int side = 18;
        System.out.println("(" + x + ", " + y + ") - drawing square with side " + side);
    }
}
