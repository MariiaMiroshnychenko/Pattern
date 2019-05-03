package gof.delegate.entity.concrete;

import gof.delegate.entity.Graphics;

public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("I'm a circle");
    }
}
