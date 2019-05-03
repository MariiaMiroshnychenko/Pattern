package gof.decorator.entity.concrete;

import gof.decorator.entity.PrinterImpl;

public class LeftBracketDecorator extends WrapperDecorator {
    public LeftBracketDecorator(PrinterImpl component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("(");
        component.print();
    }
}
