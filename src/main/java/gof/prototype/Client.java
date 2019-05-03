package gof.prototype;

import gof.prototype.entity.Human;
import gof.prototype.factory.HumanFactory;

public class Client {
    public static void main(String[] args) {
        Human human = new Human(12, "David");

        System.out.println(human);
        System.out.println(human.copy());

        HumanFactory humanFactory = new HumanFactory(human);
        System.out.println(humanFactory.makeCopy());

        humanFactory.setPrototype(new Human(33, "Alexandra"));
        System.out.println(humanFactory.makeCopy());
    }
}
