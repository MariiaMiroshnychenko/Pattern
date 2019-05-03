package gof.decorator;

import gof.decorator.entity.*;
import gof.decorator.entity.concrete.LeftBracketDecorator;
import gof.decorator.entity.concrete.QuotesDecorator;
import gof.decorator.entity.concrete.RightBracketDecorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterImpl printer = new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("Hello"))));

        printer.print();
    }
}
