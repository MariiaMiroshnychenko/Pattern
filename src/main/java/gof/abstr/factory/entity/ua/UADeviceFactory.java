package gof.abstr.factory.entity.ua;

import gof.abstr.factory.entity.DeviceFactory;
import gof.abstr.factory.entity.Keyboard;
import gof.abstr.factory.entity.Mouse;
import gof.abstr.factory.entity.TouchPad;

public class UADeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new UAMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new UAKeyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new UATouchPad();
    }
}
