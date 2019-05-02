package gof.template.method.child;

import gof.template.method.parent.Parent;

public class SecondChild extends Parent {
    @Override
    protected void secondDiffer() {
        System.out.print(" Yo.\n");
    }

    @Override
    protected void differ() {
        System.out.print("am not ");
    }
}
