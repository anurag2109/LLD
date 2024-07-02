package Behavioral_Design_Patterns.chain_of_responsibility.responsibilty;

public abstract class Logger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    Logger nextLogger;

    public void setNextLogger(Logger logger){
        this.nextLogger = logger;
    }

    public void logMessage(int level, String msg){
        if(this.level >= level){
            write(msg);
        }
        else if(nextLogger != null){
            nextLogger.logMessage(level, msg);
        }
    }
    protected abstract void write(String message);
}
