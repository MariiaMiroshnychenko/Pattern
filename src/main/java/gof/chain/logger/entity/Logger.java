package gof.chain.logger.entity;

public abstract class Logger {
    private int priority;

    Logger(int priority) {
        this.priority = priority;
    }

    private Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.writeMessage(message, level);
        }
    }

    protected abstract void write(String message);
}
