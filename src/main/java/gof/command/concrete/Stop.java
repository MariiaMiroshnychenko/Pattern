package gof.command.concrete;

import gof.command.entity.Command;
import gof.command.receiver.ComputerReceiver;

public class Stop implements Command {
    ComputerReceiver computerReceiver;

    public Stop(ComputerReceiver computerReceiver) {
        this.computerReceiver = computerReceiver;
    }

    @Override
    public void execute() {
        computerReceiver.stop();
    }
}
