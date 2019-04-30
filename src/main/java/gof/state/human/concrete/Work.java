package gof.state.human.concrete;

import gof.state.human.Activity;
import gof.state.human.context.Human;

public class Work implements Activity {
    private int dayCounter = 0;

    @Override
    public void doSomething(Human context) {
        if (dayCounter < 5) {
            System.out.println("I`m working now");
            dayCounter++;
        } else {
            context.setActivity(new Rest());
        }
    }
}
