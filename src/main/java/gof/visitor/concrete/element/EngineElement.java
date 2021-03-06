package gof.visitor.concrete.element;

import gof.visitor.element.Element;
import gof.visitor.entity.Visitor;

public class EngineElement extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
