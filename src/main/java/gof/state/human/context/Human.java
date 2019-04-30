package gof.state.human.context;

import gof.state.human.Activity;

public class Human {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doSomething() {
        activity.doSomething(this);
    }
}
