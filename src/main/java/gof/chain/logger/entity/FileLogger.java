package gof.chain.logger.entity;

public class FileLogger extends Logger {
    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("Written to file: " + message);
    }
}
