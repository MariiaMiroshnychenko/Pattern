package gof.chain.atm.entity;

import gof.chain.atm.HryvniaConstant;

public class Money implements HryvniaConstant {
    private int atm;

    public Money(int atm) {
        setAtm(atm);
    }

    public int getAtm() {
        return atm;
    }

    public void setAtm(int atm) {
        if (atm > 0 && atm <= 20000 && atm % H10 == 0) {
            this.atm = atm;
        } else {
            throw new RuntimeException("Money amount must be no more 20000 UAH and be multiple to 10");
        }
    }
}
