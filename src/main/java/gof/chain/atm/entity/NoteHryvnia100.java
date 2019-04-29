package gof.chain.atm.entity;

import gof.chain.atm.HryvniaConstant;

public class NoteHryvnia100 extends NoteModule implements HryvniaConstant {
    @Override
    public void takeMoney(Money money) {
        int countNote = money.getAtm() / H100;
        int amountModulo = money.getAtm() % H100;
        if (countNote > 0) {
            write(countNote);
        }
        if (amountModulo > 0 && nextModule != null) {
            nextModule.takeMoney(new Money(amountModulo));
        }
    }

    void write(int countNote) {
        System.out.println(countNote + " banknotes of " + H100 + " UAH were issued.");
    }
}
