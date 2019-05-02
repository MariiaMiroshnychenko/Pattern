package gof.abstr.factory.entity.en;

import gof.abstr.factory.entity.Keyboard;

public class ENKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void printLine() {
        System.out.println("Print line");
    }
}
