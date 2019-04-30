package gof.observer.meteo.entity;

import gof.observer.meteo.Observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        File file;

        try {
            file = File.createTempFile("TempPressure", ".txt");
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.write("The weather has changed. Temperature: " + temperature + " degrees, pressure: " + pressure + " mmHg.");
            printWriter.println();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
