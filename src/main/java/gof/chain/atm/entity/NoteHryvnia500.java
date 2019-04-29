package gof.chain.atm.entity;

import gof.chain.atm.HryvniaConstant;

public class NoteHryvnia500 extends NoteModule implements HryvniaConstant {
    @Override
    public int getNote() {
        return H500;
    }

    @Override
    void write(int countNote) {
        System.out.println(countNote + " banknotes of " + getNote() + " UAH were issued.");
    }
}
