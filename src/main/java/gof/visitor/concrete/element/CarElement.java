package gof.visitor.concrete.element;

import gof.visitor.element.Element;
import gof.visitor.entity.Visitor;

public class CarElement extends Element{
    Element[] elements;

    public CarElement() {
        this.elements = new Element[]{
                new WheelElement("Front Left"), new WheelElement("Front Right"),
                new WheelElement("Back Left"), new WheelElement("Back Right"),
                new BodyElement(), new EngineElement()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
