package gof.abstr.factory.entity.en;

import gof.abstr.factory.entity.DeviceFactory;
import gof.abstr.factory.entity.Keyboard;
import gof.abstr.factory.entity.Mouse;
import gof.abstr.factory.entity.TouchPad;

public class ENDeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new ENMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new ENKeyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new ENTouchPad();
    }
}
