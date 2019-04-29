package gof.chain.entity;

public class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("E-mail: " + message);
    }
}
