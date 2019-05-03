package gof.decorator.entity.concrete;

import gof.decorator.entity.PrinterImpl;

public class QuotesDecorator extends WrapperDecorator {
    public QuotesDecorator(PrinterImpl component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.println("\"");
    }
}
