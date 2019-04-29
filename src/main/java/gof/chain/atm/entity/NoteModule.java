package gof.chain.atm.entity;

public abstract class NoteModule {
    NoteModule nextModule;

    public abstract void takeMoney (Money money);

    public void setNextMoneyModule(NoteModule nextMoneyModule) {
        nextModule = nextMoneyModule;
    }

    abstract void write (int countNote);
}
