package gof.visitor.entity;

import gof.visitor.concrete.element.BodyElement;
import gof.visitor.concrete.element.CarElement;
import gof.visitor.concrete.element.EngineElement;
import gof.visitor.concrete.element.WheelElement;

public interface Visitor {
    void visit(EngineElement engineElement);
    void visit(BodyElement bodyElement);
    void visit(CarElement carElement);
    void visit(WheelElement wheelElement);
}
