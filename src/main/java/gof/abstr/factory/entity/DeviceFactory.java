package gof.abstr.factory.entity;

import gof.abstr.factory.entity.Keyboard;
import gof.abstr.factory.entity.Mouse;
import gof.abstr.factory.entity.TouchPad;

public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchPad();
}
