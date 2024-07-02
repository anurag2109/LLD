package Behavioral_Design_Patterns.chain_of_responsibility.responsibilty;

public class DebugLogger extends Logger{

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug: "+message);
    }
}
