package gof.abstr.factory;

import gof.abstr.factory.entity.DeviceFactory;
import gof.abstr.factory.entity.Keyboard;
import gof.abstr.factory.entity.Mouse;
import gof.abstr.factory.entity.TouchPad;
import gof.abstr.factory.entity.en.ENDeviceFactory;
import gof.abstr.factory.entity.ua.UADeviceFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        DeviceFactory device = getDeviceByLanguage("ENrt");

        Keyboard keyboard = device.getKeyboard();
        Mouse mouse = device.getMouse();
        TouchPad touchPad = device.getTouchPad();

        keyboard.printLine();
        mouse.scroll(2);
        touchPad.track(3, 7);
    }

    public static DeviceFactory getDeviceByLanguage (String lang) {
        if (lang.equalsIgnoreCase("UA")) {
            return new UADeviceFactory();
        } else if (lang.equalsIgnoreCase("EN")) {
            return new ENDeviceFactory();
        } else {
            throw new RuntimeException("There are no such Device Factory: " + lang);
        }
    }
}
