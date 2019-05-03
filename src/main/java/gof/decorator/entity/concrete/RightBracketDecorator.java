package gof.decorator.entity.concrete;

import gof.decorator.entity.PrinterImpl;

public class RightBracketDecorator extends WrapperDecorator {
    public RightBracketDecorator(PrinterImpl component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print(")");
}
}
