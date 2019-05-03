package gof.composite;

import gof.composite.entity.Circle;
import gof.composite.entity.Shape;
import gof.composite.entity.Square;
import gof.composite.entity.Triangle;

public class CompositeApp {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        composite1.addComponent(circle);
        composite1.addComponent(triangle);

        composite2.addComponent(square);
        composite2.addComponent(composite1);

        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.draw();
    }
}
