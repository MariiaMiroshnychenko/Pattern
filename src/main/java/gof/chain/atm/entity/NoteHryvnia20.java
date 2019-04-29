package gof.chain.atm.entity;

import gof.chain.atm.HryvniaConstant;

public class NoteHryvnia20 extends NoteModule implements HryvniaConstant {
    @Override
    public int getNote() {
        return H20;
    }

    @Override
    void write(int countNote) {
        System.out.println(countNote + " banknotes of " + getNote() + " UAH were issued.");
    }
}
