package gof.abstr.factory.entity.ua;

import gof.abstr.factory.entity.Keyboard;

public class UAKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Друкуємо рядок");
    }

    @Override
    public void printLine() {
        System.out.println("Друкуємо рядок з переводом рядка");
    }
}
