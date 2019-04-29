package gof.chain;

import gof.chain.entity.EmailLogger;
import gof.chain.entity.FileLogger;
import gof.chain.entity.Logger;
import gof.chain.entity.SMSLogger;

public class ChainApp implements LevelConstant{
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(ERROR);
        Logger fileLogger = new FileLogger(DEBUG);
        Logger emailLogger = new EmailLogger(INFO);

        smsLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(emailLogger);

        smsLogger.writeMessage("System is down", ERROR);
        smsLogger.writeMessage("The debug process is running", DEBUG);
        smsLogger.writeMessage("All right", INFO);
    }
}
