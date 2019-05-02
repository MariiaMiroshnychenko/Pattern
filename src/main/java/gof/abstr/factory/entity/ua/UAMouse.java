package gof.abstr.factory.entity.ua;

import gof.abstr.factory.entity.Mouse;

public class UAMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Клацання мишкою");
    }

    @Override
    public void doubleClick() {
        System.out.println("Подвійне клацання мишкою");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Скролимо догори");
        } else if (direction < 0) {
            System.out.println("Скролимо донизу");
        } else {
            System.out.println("Не скролимо");
        }
    }
}
