package gof.template.method;

import gof.template.method.child.FirstChild;
import gof.template.method.child.SecondChild;
import gof.template.method.parent.Parent;

public class TempMethodApp {
    public static void main(String[] args) {
        Parent firstChild = new FirstChild();
        Parent secondChild = new SecondChild();

        firstChild.templateMethod();
        secondChild.templateMethod();
    }
}
