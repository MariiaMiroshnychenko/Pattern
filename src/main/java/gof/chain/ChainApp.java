package gof.chain;

import gof.chain.entity.EmailLogger;
import gof.chain.entity.FileLogger;
import gof.chain.entity.Logger;
import gof.chain.entity.SMSLogger;

public class ChainApp {
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(LevelConstant.ERROR);
        Logger fileLogger = new FileLogger(LevelConstant.DEBUG);
        Logger emailLogger = new EmailLogger(LevelConstant.INFO);

        smsLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(emailLogger);

        smsLogger.writeMessage("System is down", LevelConstant.ERROR);
        smsLogger.writeMessage("The debug process is running", LevelConstant.DEBUG);
        smsLogger.writeMessage("All right", LevelConstant.INFO);
    }
}
