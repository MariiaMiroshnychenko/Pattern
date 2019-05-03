package gof.delegate;

import gof.delegate.entity.Painter;
import gof.delegate.entity.concrete.Circle;

public class DelegateApp {
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setGraphics(new Circle());
        painter.draw();
    }
}
