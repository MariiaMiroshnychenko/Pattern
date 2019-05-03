package gof.facade.entity;

public class HDD {
    public void copyFromDVD(DVDRom disk) {
        if (disk.isData()) {
            System.out.println("Copying data from disk...");
        } else {
            System.out.println("Insert disk with data");
        }
    }
}
