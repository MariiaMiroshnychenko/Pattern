package gof.prototype.factory;

import gof.prototype.entity.Human;

public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    public Human makeCopy() {
        return (Human) human.copy();
    }
}
