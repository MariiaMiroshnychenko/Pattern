package gof.facade.entity;

public class DVDRom {
    private boolean data;

    public boolean isData() {
        return data;
    }

    public void loadData() {
        data = true;
    }

    public void uploadData() {
        data = false;
    }
}
