package Behavioral_Design_Patterns.chain_of_responsibility.responsibilty;

public class Main {
    public static void main(String[] args) {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger infoLogger = new InfoLogger(Logger.INFO);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        infoLogger.logMessage(Logger.INFO, "This is an Info Msg Example !!");
        infoLogger.logMessage(Logger.DEBUG, "This is a Debug Msg Example !!");
        infoLogger.logMessage(Logger.ERROR, "This is an Error Msg Example !!");
    }
}
