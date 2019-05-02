package gof.visitor.concrete.element;

import gof.visitor.element.Element;
import gof.visitor.entity.Visitor;

public class WheelElement extends Element{
    private String name;

    WheelElement(String name) {
        this.name = name;
    }

    public WheelElement() {
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
