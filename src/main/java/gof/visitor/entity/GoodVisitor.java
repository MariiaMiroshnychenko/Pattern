package gof.visitor.entity;

import gof.visitor.concrete.element.BodyElement;
import gof.visitor.concrete.element.CarElement;
import gof.visitor.concrete.element.EngineElement;
import gof.visitor.concrete.element.WheelElement;

public class GoodVisitor implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Checked engine");
    }

    @Override
    public void visit(CarElement carElement) {
        System.out.println("Checked car's appearance");
    }

    @Override
    public void visit(WheelElement wheelElement) {
        System.out.println("Pumped up " + wheelElement.getName() + " wheel");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Polished body");
    }
}
