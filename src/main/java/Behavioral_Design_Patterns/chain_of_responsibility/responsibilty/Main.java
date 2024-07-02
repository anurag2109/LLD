package Behavioral_Design_Patterns.chain_of_responsibility.responsibilty;

public class Main {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.log(Logger.ERROR, "This is an Error log !!");
        logger.log(Logger.DEBUG, "This is a Debug log !!");
        logger.log(Logger.INFO, "This is an Info log !!");
    }
}
