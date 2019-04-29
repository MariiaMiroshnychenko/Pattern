package gof.chain.atm.entity;

import gof.chain.atm.HryvniaConstant;

public class NoteHryvnia100 extends NoteModule implements HryvniaConstant {
    @Override
    public int getNote() {
        return H100;
    }

    @Override
    void write(int countNote) {
        System.out.println(countNote + " banknotes of " + getNote() + " UAH were issued.");
    }
}
