package gof.memento;

import gof.memento.caretaker.File;
import gof.memento.originator.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("level 1", 2300000);

        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("level 2", 3300000);
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);
    }
}