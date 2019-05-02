package gof.visitor;

import gof.visitor.concrete.element.CarElement;
import gof.visitor.element.Element;
import gof.visitor.entity.BadVisitor;
import gof.visitor.entity.GoodVisitor;

public class Client {
    public static void main(String[] args) {
        Element car = new CarElement();

        car.accept(new BadVisitor());
        System.out.println();
        car.accept(new GoodVisitor());
    }
}
