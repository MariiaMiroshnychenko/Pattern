package gof.visitor.element;

import gof.visitor.entity.Visitor;

public abstract class Element {
    public abstract void accept(Visitor visitor);
}
