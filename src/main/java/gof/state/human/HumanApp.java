package gof.state.human;

import gof.state.human.concrete.Rest;
import gof.state.human.concrete.Work;
import gof.state.human.context.Human;

public class HumanApp {
    public static void main(String[] args) {
        Human human = new Human();

        human.setActivity(new Work());

        for (int i = 0; i < 22; i++) {
            human.doSomething();
        }
    }
}
