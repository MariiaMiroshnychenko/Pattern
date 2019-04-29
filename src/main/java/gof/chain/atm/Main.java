package gof.chain.atm;

import gof.chain.atm.entity.*;

public class Main {
    public static void main(String[] args) {
        NoteModule noteHryvnia500 = new NoteHryvnia500();
        NoteModule noteHryvnia200 = new NoteHryvnia200();
        NoteModule noteHryvnia100 = new NoteHryvnia100();
        NoteModule noteHryvnia50 = new NoteHryvnia50();
        NoteModule noteHryvnia20 = new NoteHryvnia20();
        NoteModule noteHryvnia10 = new NoteHryvnia10();

        noteHryvnia500.setNextMoneyModule(noteHryvnia200);
        noteHryvnia200.setNextMoneyModule(noteHryvnia100);
        noteHryvnia100.setNextMoneyModule(noteHryvnia50);
        noteHryvnia50.setNextMoneyModule(noteHryvnia20);
        noteHryvnia20.setNextMoneyModule(noteHryvnia10);

        noteHryvnia500.takeMoney(new Money(15_430));
    }
}
