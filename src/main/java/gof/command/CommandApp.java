package gof.command;

import gof.command.concrete.Reset;
import gof.command.concrete.Start;
import gof.command.concrete.Stop;
import gof.command.invoker.User;
import gof.command.receiver.ComputerReceiver;

public class CommandApp {
    public static void main(String[] args) {
        ComputerReceiver computerReceiver = new ComputerReceiver();
        User user = new User(new Start(computerReceiver), new Stop(computerReceiver), new Reset(computerReceiver));
        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}
