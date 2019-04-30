package gof.state.human.concrete;

import gof.state.human.Activity;
import gof.state.human.context.Human;

public class Rest implements Activity{
    private int dayCounter = 0;

    @Override
    public void doSomething(Human context) {
        if (dayCounter < 2) {
            System.out.println("I have a rest");
            dayCounter++;
        } else {
            context.setActivity(new Work());
        }
    }
}
