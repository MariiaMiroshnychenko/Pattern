package gof.state.human;

import gof.state.human.context.Human;

public interface Activity {
    void doSomething(Human context);
}
