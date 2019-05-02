package gof.template.method.child;

import gof.template.method.parent.Parent;

public class FirstChild extends Parent {
    @Override
    protected void secondDiffer() {
        System.out.println();
    }

    @Override
    protected void differ() {
        System.out.print("am ");
    }
}
