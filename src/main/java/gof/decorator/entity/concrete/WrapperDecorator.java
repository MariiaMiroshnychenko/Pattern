package gof.decorator.entity.concrete;

import gof.decorator.entity.PrinterImpl;

public abstract class WrapperDecorator implements PrinterImpl {
    PrinterImpl component;

    public WrapperDecorator(PrinterImpl component) {
        this.component = component;
    }
}
