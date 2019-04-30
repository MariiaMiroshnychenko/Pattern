package gof.command.concrete;

import gof.command.entity.Command;
import gof.command.receiver.ComputerReceiver;

public class Reset implements Command {
    ComputerReceiver computerReceiver;

    public Reset(ComputerReceiver computerReceiver) {
        this.computerReceiver = computerReceiver;
    }

    @Override
    public void execute() {
        computerReceiver.reset();
    }
}
