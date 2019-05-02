package gof.template.method.parent;

public abstract class Parent {
    public void templateMethod() {
        System.out.print("I ");
        differ();
        System.out.print("a parent.");
        secondDiffer();
    }

    protected abstract void secondDiffer();

    protected abstract void differ();
}
