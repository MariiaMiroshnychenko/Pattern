package gof.delegate.entity.concrete;

import gof.delegate.entity.Graphics;

public class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("I'm a triangle");
    }
}
