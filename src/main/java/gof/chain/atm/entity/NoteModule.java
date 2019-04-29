package gof.chain.atm.entity;

public abstract class NoteModule {
    private NoteModule nextModule;

    public abstract int getNote();

    public void takeMoney(Money money) {
        int countNote = money.getAtm() / getNote();
        int amountModulo = money.getAtm() % getNote();
        if (countNote > 0) {
            write(countNote);
        }
        if (amountModulo > 0 && nextModule != null) {
            nextModule.takeMoney(new Money(amountModulo));
        }
    }

    public void setNextMoneyModule(NoteModule nextMoneyModule) {
        nextModule = nextMoneyModule;
    }

    abstract void write (int countNote);
}
