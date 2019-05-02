package gof.visitor.entity;

import gof.visitor.concrete.element.BodyElement;
import gof.visitor.concrete.element.CarElement;
import gof.visitor.concrete.element.EngineElement;
import gof.visitor.concrete.element.WheelElement;
import gof.visitor.element.Element;

public class BadVisitor implements Visitor{
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Run engine");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Knocked on the body");
    }

    @Override
    public void visit(CarElement carElement) {
        System.out.println("Smoked in the car");
    }

    @Override
    public void visit(WheelElement wheelElement) {
        System.out.println("Kicked " + wheelElement.getName() + " wheel");
    }
}
