package gof.command.concrete;

import gof.command.entity.Command;
import gof.command.receiver.ComputerReceiver;

public class Start implements Command {
    ComputerReceiver computerReceiver;

    public Start(ComputerReceiver computerReceiver) {
        this.computerReceiver = computerReceiver;
    }

    @Override
    public void execute() {
        computerReceiver.start();
    }
}
