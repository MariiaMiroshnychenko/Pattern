package gof.proxy.entity;

import gof.memento.caretaker.File;

import java.io.FileWriter;

public class RealImage implements Image{
    private String file;

    public RealImage(String file) {
        this.file = file;
        loadToFile();
    }

    private void loadToFile() {
        System.out.println("Loading " + file);
    }

    @Override
    public void display() {
        System.out.println("Watching " + file);
    }
}
